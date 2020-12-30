import java.util.*;


class EmployeeManagment{
	
	public static void main(String args[]){
		String id=" ";
		String name=" ";
		String desig=" ";
		System.out.println("Select your choice 1/2");
		Scanner sz= new Scanner(System.in);
		String ch= sz.next();
		
		switch(ch)
		{
		
	case "1": System.out.println("Please enter your details:");
		Scanner sa= new Scanner(System.in);
		System.out.println("Employee ID:");
		id= sa.next();
		System.out.println("Employee name:");
		name= sa.next();
		System.out.println("Employee designation:");
		desig= sa.next();

	case "2":

		 System.out.println("Your details:");
		System.out.println("Employee ID:"+id );
		System.out.println("Employee :"+name);
		System.out.println("Employee DEsignation: "+desig);
			break;
	default: System.out.println("Invalid Entry");
		break;
		}
}
}