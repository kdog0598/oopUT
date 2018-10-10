/*
 * The objective of this program is to reverse a 4 digit positive number.
 * For example, input: 3456, output: 6543
 */
package midtermreverse;

import java.util.Scanner;

public class MidtermReverse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int num, digit; 
        String reverseNum = "";
        System.out.println("Enter a 4 digit number postive whole number: ");
        num = input.nextInt();
        if(num >= 1000 && num <= 9999){
            int digit4 = num % 10;
            num = num / 10;
            int digit3 = num % 10;
            num = num / 10;
            int digit2 = num % 10;
            int digit1 = num / 10;
            reverseNum = digit4 + "" +  digit3 + "" + digit2 + "" + digit1;
            //System.out.println(digit4 + "" +  digit3 + "" + digit2 + "" + digit1);
            
            
            
            //reverseNum = 
        }else{
            System.out.println("Wrong input");
        }
        System.out.println("The reversed number is " + reverseNum);
    }
    
}
