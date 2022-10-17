/* * * * *
   *     *
   *     *
   * * * *
*/class Pattern5{

public static void main(String[] args){

int n=11;

for(int i=0;i<n;i++){

 for(int j=0;j<n;j++){

  if(i==0 || j==0 || i==n-1 || j==n-1 || i==5 || j==5 || i==10-j || j==i){
  System.out.print("*"+" ");
  }
  else{
  System.out.print(" "+" ");
  }
 }
System.out.println();
}
}
}