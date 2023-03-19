import java.io.IOException;
import java.util.Scanner;
class calculator {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int a, b;
        int result = 0;
        System.out.print("Enter first value: ");
        a = s.nextInt();
        System.out.print("Enter second value: ");
        b = s.nextInt();
        int op;
        System.out.println("Enter operation: ");
        System.out.println("1 for addition ");
        System.out.println("2 for subtraction ");
        System.out.println("3 for division");
        System.out.println("4 for multiplication ");
        op = s.nextInt();

        switch(op){
            case 1 :
            {
                result = a+b;
                System.out.print("RESULT is: "+ result);
                break;    
            } 
            case 2 :
            {
                result = a-b;
                System.out.print("RESULT is: "+ result);
                break;    
            }
            case 3 :
            {
                result = a/b;
                System.out.print("RESULT is: "+ result);
                break;    
            }
            case 4 :
            {
                result = a*b;
                System.out.print("RESULT is: "+ result);
                break;    
            }
            default :
            {
                System.out.print("Please select valid operator. ");
                break;
            }
        }
    }
}