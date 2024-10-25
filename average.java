import java.util.Scanner;
public class average{
	public static void main(String[]args){
	System.out.println("Enter marks for the following subjects; Java, Networking, HCI");

Scanner myObj = new Scanner(System.in);
	int Java = myObj.nextInt();
	int Networking = myObj.nextInt();
	int HCI = myObj.nextInt();
double average = (Java + Networking + HCI)/3;
	if(average>=50){
	System.out.println("Pass");
}
else{
	System.out.println("Fail");
}
	}
}