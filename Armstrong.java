class Armstrong{
	public static void main(String[] args){
	int num=371;
    int originalNum=num;
	int rem=0;
	int sum=0;
	 
	while(num!=0){
	rem=num%10;
	sum+=Math.pow(rem,3);
	num/=10;
	
	}
	System.out.println((originalNum==sum)?"arm":"not arm");
	}
}