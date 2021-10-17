
class Perfect{
	public static void main(String[] args){
	int num=28;
    int originalNum=num;
	int sum=0;
	for(int i=1;i<=num/2;i++){
	if(num%i==0){
	sum=sum+i;
	}

	 
	}
	System.out.println(sum);
	System.out.println((originalNum==sum)?"perfect num":"not perfect num");
	
	}
}