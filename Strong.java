class Strong{
	public static void main(String[] args){
	int num=135;
	int originalNum=num;
	int fact;
	int sum=0;
	while(num!=0){
	int rem=num%10;
	fact=1;
	for(int i=rem;i>=1;i--){
	fact=fact*i;
	
	}
	sum=sum+fact;
	num=num/10;
	}
	System.out.println(sum);
	System.out.println((originalNum==sum)?"strong num":"Not a strong num");
	}
}