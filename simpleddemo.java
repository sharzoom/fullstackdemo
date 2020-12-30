final class A{
	final int a=10;
	public final void display(){
	
	System.out.println("changed value:" +a);
	}
}
 
class simpleddemo{
	public static void main (String args[]){

	System.out.println("hi");
	A a1= new A();
	System.out.println(a1.a);
	a1.display();
	}
}