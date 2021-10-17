class AlphaPattern2{
	public static void main(String []args){
		int row =5;
		char ch='A';
		for(int i=1;i<=row;i++){
			for(int j=row;j>=i;j--){
              System.out.print(ch+" ");
			
			if(ch<'Z'){
				ch++;
			}
			else{
				ch=(char)'A';
			}
			
			}
			System.out.println(" ");
			}
			
		}
	}
