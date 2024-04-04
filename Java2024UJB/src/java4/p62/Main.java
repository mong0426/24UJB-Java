package java4.p62;

//import java.util.Arrays;
//import java.util.Random;
//
//public class Main {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		int[] selectNumber = new int[6];
//		Random random = new Random();
//		System.out.println("선택 번호 : ");
//
//		// 떨어져있는 자리수에서 확인이 안되는 로직
//		int a = 0;
//		for (int i = 0; i < 6; i++) {
//			selectNumber[i] = random.nextInt(45) + 1;
//			int b = selectNumber[i];
//
//			if (b == a) {
//				i = i - 1;
//			} else {
//				System.out.println(selectNumber[i] + " ");
//				a = selectNumber[i];
//			}
//
//		}
//		System.out.println();
//
//		int[] winningNumber = new int[6];
//		random = new Random(5);
//
//		System.out.println("당첨 번호 : ");
//		for (int i = 0; i < 6; i++) {
//			winningNumber[i] = random.nextInt(45) + 1;
//			System.out.print(winningNumber[i] + " ");
//		}
//		System.out.println();
//
//		Arrays.sort(selectNumber);
//		Arrays.sort(winningNumber);
//		boolean result = Arrays.equals(selectNumber, winningNumber);
//		System.out.println("당첨 여부 : ");
//		if (result) {
//			System.out.println("축하합니다! 당첨 되셨습니다.");
//		} else {
//			System.out.println("당첨되지 않았습니다.");
//		}
//		
//		
//
//	}
//
//}


import java.util.Arrays;
import java.util.Random;

public class Main {
   public static void main(String[] args) {
      int[] selectNumber = new int[6];
      Random random = new Random();

      while (true) {
         for (int i = 0; i < selectNumber.length; i++) {
            selectNumber[i] = random.nextInt(45) + 1;
         }

         Arrays.sort(selectNumber);
         boolean eq = false;
         for (int i = 0; i < selectNumber.length - 1; i++) {
            if (selectNumber[i] == selectNumber[i + 1]) {
               eq = true;
               break;
            } else {
               eq = false;
            }
         }
         if (eq == false) {
            break;
         }
      }

      System.out.println("선택 번호 : ");
      for (int i = 0; i < selectNumber.length; i++) {
         System.out.print(selectNumber[i] + " ");
      }
      System.out.println();

      int[] winningNumber = new int[6];
      random = new Random(5);

      for (int i = 0; i < 6; i++) {
         winningNumber[i] = random.nextInt(45) + 1;
      }

      System.out.println("당첨 번호 : ");
      for (int i = 0; i < winningNumber.length; i++) {
         System.out.print(winningNumber[i] + " ");
      }
      System.out.println();

      Arrays.sort(selectNumber);
      Arrays.sort(winningNumber);
      boolean result = Arrays.equals(selectNumber, winningNumber);
      System.out.println("당첨 여부 : ");
      if (result) {
         System.out.println("축하합니다.! 당첨 되셨습니다.");
      } else {
         System.out.println("당첨 되지 않았습니다.");
      }
   }
}

/*
import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;


public class Main {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      int selectNumber[] = Nums();
      System.out.println("선택 번호 : ");
      PrintNums(selectNumber);

      int[] winnigNumber = Nums();
      System.out.println("당첨 번호 : ");
      PrintNums(winnigNumber);

      Arrays.sort(selectNumber);
      Arrays.sort(winnigNumber);
      boolean result = Arrays.equals(selectNumber, winnigNumber);
      System.out.println("당첨 여부 : ");
      if (result) {
         System.out.println("당첨");
      } else {
         System.out.println("꽝");
      }
   }

   public static int[] Nums() {
      HashSet<Integer> numSet = new HashSet<>();
      Random random = new Random();
      while (numSet.size() < 6) {
         int num = random.nextInt(45) + 1;
         numSet.add(num);
      }
      int[] nums = new int[numSet.size()];
      int idx = 0;
      for (int num : numSet) {
         nums[idx++] = num;
      }
      Arrays.sort(nums);
      return nums;

   }

   public static void PrintNums(int[] nums) {
      for (int num : nums) {
         System.out.println(num);
      }
   }

}
*/