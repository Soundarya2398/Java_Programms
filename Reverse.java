class Reverse{
public static String reverseString(String str){
StringBuffer sb=new StringBuffer(str);
return sb.reverse().toString();
	
}

	public static void main(String []args){
	String str="asam";
	String reverseString=reverseString(str);
	System.out.println(reverseString);
	}
}