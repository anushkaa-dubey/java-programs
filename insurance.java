import java.util.Scanner;
public class XYZ{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("ENTER AGE");
int age=sc.nextInt():
System.out.println("ENTER 'M' if male, 'F' if female");
System.out.println("ENTER 'R' if married or 'U' if unmarried");
char gender=sc.next().toUpperCase().charAt(0);
char s=sc.next().toUpperCase().charAt(0);
if(s=='R'){
  System.out.println("Granted");
}
  else(){
      if((gender=='M'&&age>35)||(gender=='F'&&age>30)){
           System.out.println("Granted");
        }
  else{
    System.out.println("Not granted");
  }
}
}
}
