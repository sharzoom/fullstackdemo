class Abcd{
	Abcd(){
		System.out.println("this is abcd default constructor");
		}
	void disp(){
	System.out.println("this is disp1 method");
		}
class Xyz{
	XYz(){
	System.out.println("this is Xyz constructor");
		}

	void disp(){
	System.out.println("this is disp1 method");

		}
 }

class Abc extends Xyz,Abcd{
	Abc(){
		super(10,20);
	System.out.println("this is Abc default constructor");
		}
}
class super{

	public static void main(String args[]){
	
	Abc a1 = new Abc();
	}
	}

}








