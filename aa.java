class xyz{
                  xyz(){
                      System.out.println("default xyz");
			 }
                  xyz(int x , int y){
                        System.out.println("parametrized xyz" +x +y);
				}
            void disp1(){
            System.out.println("disp xyz method");
			}
	}
         
class abc extends xyz{

            abc(){
            	super(3,4);
       		System.out.println("default abc");
                 }
            void disp(){
            System.out.println("disp abc method");
				}
	}

class aa{
 	  public static void main (String args[]){
		abc a1=new abc();
                a1.disp1();
            
	}
}