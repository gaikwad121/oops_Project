package oops_Program;

public class Dog {
	String dogName;
	int dogId;
	public void eat() {
		System.out.print("eating a food");
	}
	
public static void main(String[] args) {
	Dog d=new Dog();
	d.dogId=34521;
	d.dogName="burow";
	System.out.print(d.dogName+" "+d.dogId+" ");
	d.eat();

}
}
