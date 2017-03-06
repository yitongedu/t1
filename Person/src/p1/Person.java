package p1;

public class Person {
	Person(){
		System.out.println("狗仔放 发");
	}
	
	public void finalize(){
		System.out.println("the object is going!");
	}
	public static void main(String[] args) {
		Person p=new Person();
		new Person();
		new Person();
		
		System.gc();
		System.out.println("the program is ending!");
	}
}
