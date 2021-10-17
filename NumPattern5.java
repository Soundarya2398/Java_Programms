class NumPattern5{
	public static void main(String []args){
		int row=4;
		for(int i=1;i<=row;i++){
			for(int j=row-1;j>=i;j--){
				System.out.print(" ");
			}
			for(int k=i-1;k>=-(i-1);k--){
				System.out.print(i-Math.abs(k));
			}
			System.out.println();
		}
	}
}