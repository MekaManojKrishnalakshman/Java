import java.util.Scanner;

public class Controlstatements {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Grade:");
        int grade =sc.nextInt();
        if(grade>=90){
            System.out.println("Outstanding");
        }
        else if(grade>=75&&grade<90){
            System.out.println("Good performance");
        }
        else{
            System.out.println("You need to improve");
        }



    }
    
}
