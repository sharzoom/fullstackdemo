class A{
	int a=20;
	
	int abc(){
		int b=20;
		int d=30;
		
System.out.println("this is the abc method");
 		return b+d;
}
}

class diffclass {

	public static void main (String args[]){
		System.out.println("this is the switch demo");
		A a1= new A();
		System.out.println(a1.abc());
}
}