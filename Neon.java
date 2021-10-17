class Neon{
	public static void main(String[] args){
 int num=9;
 int square=num*num;
 int rem;
 int sum=0;
 while(square!=0){
    rem=square%10;
    sum=sum+rem;
    square/=10;
 }
 System.out.println((num==sum)?"neon num":"not neon num");
	}
}