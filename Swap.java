import java.util.Scanner;
class Swap{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("The Value of a:"+a +" and b:"+b+" Before Swaping ");
		b=a+b-(a=b);
		System.out.println( " The value of  a and b after swapping a:"+a+" b:"+b);
		
	}
}