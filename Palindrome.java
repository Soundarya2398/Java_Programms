import java.util.Scanner;
class Palindrome{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int originalNum=num;
		int rev=0;
		int rem;
		while(num!=0){
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		if(rev==originalNum){
			System.out.println("The num is palindrome");
		}
			else{
			System.out.println("The num is not palindrome");	
		}

	}

}