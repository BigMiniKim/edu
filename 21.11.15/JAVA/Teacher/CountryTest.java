import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;
/*
//country.bin 에 HashMap<String, Integer> map; 안에 저장된 나라와 인구수를 저장
//I/O Stream 사용 
public boolean saveFileMap() {
 
}
//I/O Stream 사용 
//저장된 country.bin 을 읽어 들여, HashMap<String, Integer> 으로 반환  
public HashMap<String, Integer> readFileMap() {
 
}
//I/O Stream 사용 
//저장된 country.bin 을 읽어 들여, 저장된 나라와 인구수를 출력
public void printFileMap() {
		    
}
*/

class CountryMap {
	private HashMap<String, Integer> map;

	public CountryMap() {
		map = new HashMap<>();
	}

	public HashMap<String, Integer> getMap() {

		try {
			System.out.println("나라 이름과 인구를 입력하세요.(예: Korea 5000)");
			Scanner sc = new Scanner(System.in);

			int population = 0;
			String country = " ";

			while (true) {
				System.out.print("나라 이름, 인구 >> ");
				country = sc.next();

				if (country.equals("그만")) // 입력 "그만" 하면 입력 종료
					break;

				population = sc.nextInt();
				map.put(country, population);
			}

		} catch (Exception e) {
			System.out.println("잘못된 입력입니다. 다시 입력하세요.");
			getMap();
		}

		return map;
	}

	public void setMap(HashMap<String, Integer> map) {
		this.map = map;
	}

	public void search() {

		try {
			// 키 입력받아서 검색해서 정보 출력하기 그만할때까지
			// 없으면 없습니다 출력
			Scanner sc = new Scanner(System.in);

			String key = " ";
			while (true) {
				System.out.print("인구 검색 >> ");
				key = sc.next();

				if (key.equals("그만")) // 입력 "그만" 하면 검색 종료
					break;
				else if (!map.containsKey(key)) { // map의 key에 key가 있지 않으면
					System.out.println(key + " 나라는 없습니다.");
					continue;
				}
				System.out.println(key + " " + map.get(key)); // 키값으로 내용 출력
			}

		} catch (Exception e) {
			System.out.println("잘못된 입력입니다. 다시 입력하세요.");
			getMap();
		}

	}

	private static final String FILE_NAME = "country.bin";

	public boolean saveFileMap() {
		boolean isDone = true;

		OutputStream os = null;
		DataOutputStream dos = null;

		try {
			os = new FileOutputStream(FILE_NAME);
			dos = new DataOutputStream(os);

			Set<String> set = map.keySet();

			for (String key : set) {

				String country = key;
				int population = map.get(key);

				dos.writeUTF(country);
				dos.writeInt(population);
			}

		} catch (Exception e) {
			e.printStackTrace();
			isDone = false;
		} finally {
			try {
				if (os != null)
					os.close();

				if (dos != null)
					dos.close();

			} catch (Exception e2) {

			}

		}

		return isDone;

	}

	public HashMap<String, Integer> readFileMap() {

		HashMap<String, Integer> countryMap = new HashMap<String, Integer>();

		InputStream is = null;
		DataInputStream dis = null;

		try {
			is = new FileInputStream(FILE_NAME);
			dis = new DataInputStream(is);

			while (dis.available() > 0) {

				String country = dis.readUTF();
				int pop = dis.readInt();

				countryMap.put(country, pop);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (is != null)
					is.close();

				if (dis != null)
					dis.close();

			} catch (Exception e2) {

			}

		}

		return countryMap;

	}
	
	//저장된 country.bin 을 읽어 들여, 저장된 나라와 인구수를 출력
	public void printFileMap() {
		
		InputStream is = null;
		DataInputStream dis = null;

		try {
			is = new FileInputStream(FILE_NAME);
			dis = new DataInputStream(is);

			while (dis.available() > 0) {

				String country = dis.readUTF();
				int pop = dis.readInt();

				System.out.println("나라" + country + "인구" + pop);				
				
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (is != null)
					is.close();

				if (dis != null)
					dis.close();

			} catch (Exception e2) {

			}

		}


	}
	

}

public class CountryTest {

	public static void main(String[] args) {
		/*CountryMap countryMap = new CountryMap();
		countryMap.getMap();

		System.out.println();
		countryMap.search();*/
		
		CountryMap map = new CountryMap();
		
		map.getMap();
		map.saveFileMap();
		
		System.out.println("==========");
		map.readFileMap();
		map.printFileMap();
		
		

	}

}
