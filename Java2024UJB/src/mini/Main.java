package mini;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("1~9까지 3자리 숫자를 입력해주세요.");
		int score = sc.nextInt();
		sc.close();
		char score1 = (char) score;
		
		
		Random random = new Random();
		

		
	     int[] winningNumber = new int[3];
	      random = new Random(2);

	      for (int i = 0; i < 3; i++) {
	         winningNumber[i] = random.nextInt(2) + 1;
	      }


	}

}
