package java4.p9;

public class KeyExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Key k1 = new Key(3);
		Key k2 = new Key(5);
		Key k3 = k1;
		
		System.out.println("k1.hashCode() : " + k1.hashCode());
		System.out.println("k2.hashCode() : " + k2.hashCode());
		System.out.println("k3.hashCode() : " + k3.hashCode());
	}

}
