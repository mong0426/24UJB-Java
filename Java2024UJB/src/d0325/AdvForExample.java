package d0325;

public class AdvForExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] scores = {9,7,8,9,8};
		
		int sum = 0;
		/*
		for(int s : scores) {
			sum += s;

		}
		
		*/
		for(int i=0;i<=4;i++) {
			sum += scores[i];
		}
		
		System.out.println("sum : " + sum);

	}

}
