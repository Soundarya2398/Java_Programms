class Pattern4{
public static void main(String[] args){
int row=3;
int space=0;
int star=3;
    for(int i=1;i<=row;i++){
         for(int j=1;j<=space;j++){
           System.out.print(" ");
}
  for(int k=1;k<=star;k++){
System.out.print("*");

}
space++;
star--;

System.out.println();
}

}
}