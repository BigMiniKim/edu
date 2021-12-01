package edu.kosmo.ex;

import java.util.Arrays;

public class LottoGame {

	

		 private int lottoNum[] = new int[5];
		 private int bonusNum;

		 public LottoGame() {

		 }


		 public void makeLotto() {
		  int lotto[] = new int[6];
		  for (int i = 0; i < 6; i++) {
		   lotto[i] = (int) (Math.random() * 45) + 1; // 첫 뽑기.
		   for (int j = 0; j < i; j++) { // 중복여부를 확인을 위한 for문.
		    if (lotto[i] == lotto[j]) { // 중복될 때 처리.
		     j = 0; // 다시 처음부터 중복여부를 확인하기 위해 j 를 0으로 초기화.
		     lotto[i] = (int) (Math.random() * 45) + 1; // 다시 뽑기.
		    }
		   }
		  }
		  for (int i = 0; i < 5; i++)
		   this.lottoNum[i] = lotto[i];
		  bonusNum = lotto[5];
		  System.out.println("로또 번호 뽑기가 완료되었습니다.");
		 }

		 public int checkLotto(int lotto[]) {
		  int count = 0;
		  System.out.print("맞은 번호 : ");
		  for(int i = 0; i<6; i++){
		   for(int j = 0; j<5; j++)
		    if(lotto[i]==lottoNum[j]){
		     System.out.print(lotto[i]+", ");
		     count++;
		     break;
		    }
		   if(lotto[i]==bonusNum){
		    System.out.print(lotto[i]+", ");
		    count++;
		   }
		  }
		  System.out.println();
		  return count;
		 }

		 public int[] getLottoNum() {
		  return lottoNum;
		 }

		 public int getBonusNum() {
		  return bonusNum;
		 }

		 @Override
		 public String toString() {
		  return "lottoNum :" + Arrays.toString(lottoNum) + ", bonusNum=[" + bonusNum+"] ";
		 }

		}



		
