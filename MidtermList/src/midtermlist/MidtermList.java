/*
 * This program finds out the second largest element in a list.
 * 
 */
package midtermlist;

import java.util.Scanner;


public class MidtermList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int largestElement = 0;
        int secondLargest = 0;
        System.out.println("Enter the number of elements in the list: ");
        int n = input.nextInt();
        int[] list1 = new int[n];
        System.out.println("Enter "+n+" distinct elements one by one: ");
        for(int i = 0; i< n; i++){
            list1[i] = input.nextInt();
        }
        largestElement = list1[0];
        for(int i=1; i<n; i++){
            if(largestElement < list1[i]){
                //secondLargest = largestElement;
                largestElement = list1[i];
            }
            if(secondLargest < list1[i] && secondLargest < largestElement){
                int tempSecond = secondLargest;
                secondLargest = list1[i];
                if(secondLargest == largestElement){
                    secondLargest = tempSecond;                    
                }
            }
        }
        System.out.println(largestElement + " " + secondLargest);
    }
    
}
