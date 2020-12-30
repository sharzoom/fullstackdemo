System.out.println("now to view your details please select 2");
		Scanner ss= new Scanner(System.in);
		String ee= ss.next();
				  switch(ee)
		{
			case "2": 
				 System.out.println("Your details:");
				System.out.println("Employee ID:"+id );
				System.out.println("Employee :"+name);
				System.out.println("Employee DEsignation: "+desig);
			break;
			default: System.out.println("Invalid Entry");
				break;
		}
			break;