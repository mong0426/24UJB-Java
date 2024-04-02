package d0402.p54;

public class Main {

	public static void main(String[] args) {
		RemoteControl rc;
		rc = new Television();
		rc.turnOn();
		rc.turnOff();
		
		RemoteControl rc2 = new RemoteControl() {

			@Override
			public void turnOn() {
				// TODO Auto-generated method stub
				System.out.println("RemoteContrl - turnOn()");
			}

			@Override
			public void turnOff() {
				// TODO Auto-generated method stub
				System.out.println("RemoteContrl - turnOff()");				
			}

			@Override
			public void setVoulume(int volume) {
				// TODO Auto-generated method stub
				
			}
			
		};
		rc2.turnOn();
		rc2.turnOff();

	}

}
