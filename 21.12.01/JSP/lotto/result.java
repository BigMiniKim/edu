 import java.util.Arrays;
import java.util.Scanner;

public class Test {
 public static void main(String[] args) {
  
  int[] num = { 2, 10 ,16, 21, 25, 41 };
  
  Lotto lot = new Lotto();
  
  lot.makeLotto();
  
  System.out.println(lot);
  
  System.out.println("사용자 로또 번호 : "+Arrays.toString(num));
  System.out.println("맞은 갯수는 : "+lot.checkLotto(num));
 
 }
}



출처: https://webcache.googleusercontent.com/search?q=cache:Z_koWUCbD8YJ:https://justbaik.tistory.com/%3Fpage%3D18+&cd=1&hl=ko&ct=clnk&gl=kr [JustB블로그]
