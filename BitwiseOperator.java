class BitwiseOperator{
public static void main(String args[]){
int x=10;
int y=20;
boolean orresult=(x!=y)|(++x>y);
System.out.println(orresult);
System.out.println("x: "+x);
boolean andresult=(x==y)&(x!=y++);
System.out.println(andresult);
System.out.println("y: "+y);
}
}