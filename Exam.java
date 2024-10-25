import java.util.Scanner; 

public class Exam  {

    public static void main(String[] args) { 
        System.out.println("Enter marks of the following subjects: Assignment1, Assignment2, Cat1, and Cat2:"); // Corrected the print statement

        Scanner myObj = new Scanner(System.in); 
        int Assignment1 = myObj.nextInt();
        int Assignment2 = myObj.nextInt();
        int Cat1 = myObj.nextInt();
        int Cat2 = myObj.nextInt();

        double average = (Assignment1 + Assignment2 + Cat1 + Cat2);
        
        if (average >= 50) {
            System.out.println("A"); 
        } else if (average >= 30) {
            System.out.println("B"); 
        } else if (average >= 20) {
            System.out.println("C"); 
        } else if (average >= 10) {
            System.out.println("D"); 
        } else if (average >=0){
            System.out.println("F"); 
        }

        
    }
}