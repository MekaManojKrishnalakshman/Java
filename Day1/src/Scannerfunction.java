import java.util.Scanner;
public class Scannerfunction {
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the Name:");
        String s =input.next();
        System.out.println("Your Name is:" +s);
        input.close();



    }
    
}
