public class Bubblesort {

	public static void main(String[] args) {
		
		int[] a= {4,3,5,1,2};
		
		for(int i=0;i<=a.length;i++) {
			int flag=0,temp;
			for ( int j=0;j<a.length-1-i;j++) {
				if(a[j]>a[j+1]) {
					temp=a[j+1];
					a[j+1]=a[j];
					a[j]=temp;

					flag=1;
				}
			}
			if(flag==0) {
				break;
			}
				}
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
}
}
