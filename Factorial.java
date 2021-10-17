class Factorial{
public static int Factnum(int n){
	if(n==0)
	return 1;
	else 
	return(n*Factnum(n-1));
}
	public static void main(String []args){
	int fact=1;int num=5;
	fact=Factnum(num);
	System.out.println(fact);
	}
}