class stringdemo{

	public static void main(String args[]){
	int a=50;
	System.out.println("A value is :" +(a+100));

	//string literal

	String s= "santhosh"; 
	System.out.println(s);
	s= s.concat("kumar");
	System.out.println(s.toUpperCase());
	System.out.println(s);

	//using newkeyword

	String str2= new String("harry");
	System.out.println(str2);
	str2.concat("peter");
	System.out.println(str2);

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