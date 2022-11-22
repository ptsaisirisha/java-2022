class IncrementOperatorDemo{
public static void main(String[] args){
int x=100;
int y=++x;
System.out.println("x:"+x);
System.out.println("y:"+y);

int p=500;
int q=p++;
System.out.println("p:"+p);
System.out.println("q:"+q);

int a=10;
int b=a++;
int c=++b;
System.out.println("a:"+a);
System.out.println("b:"+(++b));
System.out.println("c:"+(c++));
System.out.println("c:"+c);
}
}