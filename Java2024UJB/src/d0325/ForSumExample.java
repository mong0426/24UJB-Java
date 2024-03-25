package d0325;

public class ForSumExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long sum =0;
		
		for(long i=1;i<=100000;i++) {
			sum += i;
		}

		System.out.println("sum = " + sum);
	}

}
