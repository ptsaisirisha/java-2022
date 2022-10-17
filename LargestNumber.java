class LargestNumber{

public static void main(String[] args){
int a=100;
int b=200;
int c=250;

int result = (a > b) ? (a > c ? a : c) : (b > c ? b : c);

System.out.println("the Largest Number is:" +result);

}
}