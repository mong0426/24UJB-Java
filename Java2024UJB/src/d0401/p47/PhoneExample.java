package d0401.p47;

public class PhoneExample {

	public static void main(String[] args) {
//		Phone phone = new SmartPhone?
//		SmartPhone smartPhone = new SmartPhone("홍길동");
//		smartPhone.turnOff(); 
//		smartPhone.turnOn();
//		smartPhone.internetSearch();
		
		Phone phone = new Phone(" 홍길동");
		
		Phone phone2 = new SmartPhone("임꺽정");
		phone2.turnOn();
		phone2.turnOff();
		
		Phone phone3 = new SmartPhone("홍길동");
		phone3.turnOn();
		phone3.turnOff();
//		phone3.internetSearch();
		}

}
