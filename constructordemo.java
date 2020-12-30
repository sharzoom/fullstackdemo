class Abc{
	int x;
	int y;
	Abc(){
	this(20,30);
	System.out.println("this is default constructor");
		}
	
	Abc(int x,int y){

		
		this.x=x;
		this.y=y;
		System.out.println("this is parametrized constructor");
		}

	public void display(){
		this.display2();
		System.out.println("x value is:"+x+" y value is:"+y);
		}
	public void display2(){

		System.out.println("this display 2");
		}
}

class constructordemo{
 	
	public static void main(String args[]){

	Abc a1= new Abc();

	a1.display();
	

	}
}