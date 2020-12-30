abstract class RBI{

	abstract void loan();
}

class SBI extends RBI{

	void loan(){
	System.out.println("sbi provoies lloan for 8%");
}
}
class AXIS extends RBI{

	void loan(){
	System.out.println("axia provoies lloan for 5%");
}
}
class SIB extends RBI{

	void loan(){
	System.out.println("SIB provoies lloan for 6%");
}
}
class abstractdemo{

                public static void main (String args[]){
			System.out.println("-------abstractdemo-----");
		SBI s= new SBI();
		s.loan();
		RBI r= new SBI();
		r.loan();
		}
}