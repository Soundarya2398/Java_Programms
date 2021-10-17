class NumPattern10{
	public static void main(String []args){
	
	int row=5;
	for(int i=1;i<=row;i++){
	for(int j=0;j<i;j++){
	System.out.print(((i+j)%2)+" ");
	
	}
	System.out.println();
	}
	}
}