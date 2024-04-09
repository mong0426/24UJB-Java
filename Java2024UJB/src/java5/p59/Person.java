package java5.p59;

public class Person implements Comparable<Person> {
	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public int compareTo(Person arg0) {
		if (getAge() < arg0.getAge())
			return -1;
		else if (getAge() == arg0.getAge())
			return 0;
		else 
			return 1;
	}

	public String getName() {
		return name;
	}


	public int getAge() {
		return age;
	}

}
