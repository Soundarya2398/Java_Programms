class AlphaPattern1{
	public static void main(String []args){
		int row =5;
		char ch='A';
		for(int i=0;i<row;i++){
			for(int j=0;j<i;j++){
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
