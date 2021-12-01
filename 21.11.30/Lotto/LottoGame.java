package edu.kosmo.ex;

public class LottoGame {

	class Lotto{

		int lottoNum[] = new int[6];    

		public Lotto() {
		    setLottNum();
		}

		public void setLottNum() {

		    for(int i=0; i < lottoNum.length  ; i++) {
		        
		        lottoNum[i] = (int)(Math.random()*45) + 1;

		        
		        for(int j = 0 ;  j < i ; j++) {            
		            if(lottoNum[i] == lottoNum[j]) {
		                i--;
		                break;
		            }
		        }
		    }

		}

		public void printLotto() {
		  
		    for(int i=0;i<6;i++)
		        System.out.print(lottoNum[i] + " ");
		}   
	}
}
