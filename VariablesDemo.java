class A{
	int b=50;                                                   //instance variable scope will through out the class
	int a=39;
void display(){

	int b=60;                                                    //local variable scope will only in this method
	System.out.println(a);
	System.out.println("B value inside display method: " +b);
	}
}

class VariablesDemo{

	public static void main(String args[])
{
	System.out.println("--this is variable demo");
	int a=90;
	System.out.println(a);
	A a1=new A();
	
	a1.display();
System.out.println("instance variable : "+a1.b);
}

}  