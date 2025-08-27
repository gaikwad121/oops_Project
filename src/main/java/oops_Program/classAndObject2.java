package oops_Program;

public class classAndObject2 {
String Name;
int rollNum;
String Address;
public String statuscheck() {
	String status="valid";
	if(status.equals("valid")) {
		System.out.println("Valid status");
	}
	return status;

	
}
public static void main(String[] args) {
	classAndObject2 c=new classAndObject2();
  c.Name="Jyoti";
  c.Address="Solapur Maharashtra";
  c.rollNum=89;
  c.Name="Aishwarya";
  System.out.println(c.Name);
  System.out.println(c.Address);
  System.out.println(c.rollNum);
  c.statuscheck();
}
}

