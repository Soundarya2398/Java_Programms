class AlphaPattern3{
	public static void main(String []args){
		int row =5;
		char ch='A';
		for(int i=1;i<=row;i++){
			for(int j=1;j<=row;j++){
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
