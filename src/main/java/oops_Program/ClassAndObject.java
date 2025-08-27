package oops_Program;

public class ClassAndObject {
	String name;
	int rollNum;
	
public void demo() {
	System.out.println("Hello Jyoti M  Gaikwad !");
}
public static void main(String[] args) {
	ClassAndObject s=new ClassAndObject() ;
		s.name="jyoti";
		s.rollNum=25;
		s.demo();
		System.out.println(s.name);
		System.out.println(s.rollNum);
	}
}


