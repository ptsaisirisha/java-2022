class flower{
String name;
String colour;
int noofpetals;
void sheddingfragrance(){
System.out.println(colour+" "+name+" "+"is shedding fragrance...");
}
void blooming(){
System.out.println(colour+" "+name+" "+"is blooming...");
}
public static void main(String args[]){
flower rose = new flower();
rose.name="rose";
rose.colour="red";
rose.noofpetals=12;
rose.blooming();
rose.sheddingfragrance();

flower lotus=new flower();
lotus.name="lotus";
lotus.colour="pink";
lotus.noofpetals=8;
lotus.blooming();
lotus.sheddingfragrance();

flower lily=new flower();
lily.name="lily";
lily.colour="white";
lily.noofpetals=6;
lily.blooming();
lily.sheddingfragrance();
}
}