class student{
String name;
String branch;
String college;
int rollno;
int dob;
void studentstudying(){
System.out.println(name+" in "+branch+" "+" is studying in "+college);
}
public static void main(String args[]){
student siri=new student();
siri.name="siri";
siri.branch="ece";
siri.college="rymec";
siri.rollno=1;
siri.dob=1999;
siri.studentstudying();

student sujju=new student();
sujju.name="sujju";
sujju.branch="bsc";
sujju.college="vnc";
sujju.rollno=2;
sujju.dob=2000;
sujju.studentstudying();

student poori=new student();
poori.name="poori";
poori.branch="pcm";
poori.college="vnc";
poori.rollno=3;
poori.dob=1999;
poori.studentstudying();
}
}