import java.util.Scanner;
class Pattern2_1{
public static void main(String []args){
Scanner sc=new Scanner(System.in);
int row=sc.nextInt();
int star=1;
for(int i=1;i<=row;i++){
 for(int j=1;j<=star;j++){
   System.out.print("*");
}
System.out.println();
star++;

}
}
}
