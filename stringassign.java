class stringassign{

	public static void main(String args[]){

	//string literal

	String s= "fathima"; 
	s= s.concat("sharsoom");
	System.out.println(s.toUpperCase());

	//using newkeyword

	String str2= new String("harry");
	s= str2.concat("potter");
	String s1= "mickey";
	String s2= "potter";
	String s3 = "";
	String s4 = "       Hello World!        ";
	System.out.println(s4);
	System.out.println(s4.trim());
	System.out.println(s3.isEmpty());
	 char result = s2.charAt(0);
	System.out.println(result);
	System.out.println(s.toLowerCase());
	System.out.println(s.indexOf("potter"));
	System.out.println(s.length());
	System.out.println(s.contains("t"));
	System.out.println(s.compareTo(s1));
	System.out.println(s.equals(s2));
	System.out.println(s1.replace('m', 'p'));
	System.out.println(s1.startsWith("mi"));
	System.out.println(s2.endsWith("er"));
	System.out.println(s2.hashCode());

	//using string buffer

	StringBuffer sb= new StringBuffer("Iprimed");
	sb.append("education training");
	System.out.println(sb);
	

	//using StringBuilder
 
	StringBuilder sbu= new StringBuilder("hello");
	sbu.append("world");
	System.out.println(sbu);
	

	}
}

//index Returns the position of the first found occurrence of specified characters in a string
//substring Extracts the characters from a string, beginning at a specified start position, and through the specified number of character
//lenght Returns the length of a specified string
//