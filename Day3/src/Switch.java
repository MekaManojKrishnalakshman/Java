import java.util.Scanner;

public class Switch {
    public  static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String dayname;
        int day =sc.nextInt();
        switch (day) {
            case 1:
            dayname="Monday";
            break;
            case 2:
            dayname="Tuesday";
            break;
            case 3:
            dayname="Wednesday";
            break;     

        
            default:
            dayname="Invalid Day";
            break;
        }
        System.out.println("The Day is:" +dayname);
        
    }
    
}

