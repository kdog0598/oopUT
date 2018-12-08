/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package writetest;

import java.io.*;
import java.util.Arrays;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class WriteTest {
    public static void main(String[] args) {
        String name = "Kieran M Wilson";
        String phone_number = "9374782718";
        String email = "email123";
//        write.main(name, phone_number, email);
//        write.main("James J Jameson", "0123456789", "email@email.com");
//        read.main();
        edit.main();
    }
}

class write {
    public static void main(String name, String phone_number, String email) {
        Calendar date = new GregorianCalendar();
        Scanner in = new Scanner(System.in);
        int num = 0;
        String userprofile = System.getenv("USERPROFILE");
        String fileName = userprofile + "\\Desktop\\temp\\temp.txt";
        try {
            File file = new File(fileName);
            FileWriter output1 = new FileWriter(file, true);
            PrintWriter output2 = new PrintWriter(output1);
            output1.append(name + "\t");
            output1.append(phone_number + "\t");
            output1.append(email + "\t");
            output2.println((Calendar.YEAR) + date.get(Calendar.MONTH) + date.get(Calendar.DATE));
            
            output1.close();
            output2.close();
        }
        catch(IOException e){
            System.out.print(e);
        }
    }
}
class read {
    public static ArrayList[] main(){
        String firstName, mi, lastName, phoneNumber, emailAddress, fullName;
        String userprofile = System.getenv("USERPROFILE");
        String fileName = userprofile + "\\Desktop\\temp\\temp.txt";
        Path path = Paths.get(fileName);
        int lineCount = 0;
        ArrayList[] list;
        try{
            lineCount = (int) Files.lines(path).count();
        }
        catch(IOException ex){
        }
        
        list = new ArrayList[lineCount];
        try {
            File file = new File(fileName);
            Scanner in = new Scanner(file);
            while(in.hasNext()){
                for(int i=0;i<list.length;i++){
                    list[i] = new ArrayList<>();
                    firstName = in.next();
                    mi = in.next();
                    lastName = in.next();
                    fullName = firstName + " " + mi + " " + lastName;
                    phoneNumber = in.next();
                    emailAddress = in.next();
                    in.nextLine();
                    list[i].add(fullName);
                    list[i].add(phoneNumber);
                    list[i].add(emailAddress);
                }
            }
        }
        catch(IOException e){
            System.out.print(e);
        }
        return list;
    }
}

class edit {
    
    public static void main(){
        Calendar date = new GregorianCalendar();
        Scanner in = new Scanner(System.in);
        int num = 0;
        String userprofile = System.getenv("USERPROFILE");
        String fileName = userprofile + "\\Desktop\\temp\\temp.txt";
        ArrayList[] list = edit();
        try {
            PrintWriter pw = new PrintWriter(fileName);
            pw.close();
            File file = new File(fileName);
            for(int i=0;i<list.length;i++){
                FileWriter output1 = new FileWriter(file, true);
                PrintWriter output2 = new PrintWriter(output1);
                output1.append(list[i].get(0) + "\t");
                output1.append(list[i].get(1) + "\t");
                output1.append(list[i].get(2) + "\t");
                output2.println((Calendar.YEAR) + date.get(Calendar.MONTH) + date.get(Calendar.DATE));

                output1.close();
                output2.close();
            }
        }
        catch(IOException e){
            System.out.print(e);
        }
    }
    
    public static ArrayList[] edit(){
        ArrayList[] list = read();
        int index = search(list);
        String edit;
        System.out.print("Would you like to edit the name(1), number(2), or email address(3) of " + list[index].get(0) + " ");
        Scanner input = new Scanner(System.in);
        int choice = input.nextInt();
        input.nextLine();
        switch (choice) {
            case 1:
                System.out.print("Enter new name (First MI Last) ");
                edit = input.nextLine();
                list[index].set(0, edit);
                break;
            case 2:
                System.out.println("Enter new phone munber (123-456-7890) ");
                edit = input.nextLine();
                list[index].set(1, edit());
                break;
            case 3:
                System.out.println("Enter email address ");
                edit = input.nextLine();
                list[index].set(2, edit);
                break;
            default:
                break;
        }
        return list;
    }
    
    public static int search(ArrayList[] list){
//        ArrayList[] list = read();
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter search term: ");
        String searchTerm = input.next();
        
        int i;
        outerloop:
        for(i=0;i<list.length;i++){
            for(int j=0;j<list[i].size();j++){
                if(list[i].get(j).equals(searchTerm)){
                    break outerloop;
//                    System.out.println(list[i]);//.get(0));
                }
            }
        }
        return i;
    }
    
    public static ArrayList[] read(){
        String firstName, mi, lastName, phoneNumber, emailAddress, fullName, date;
        String userprofile = System.getenv("USERPROFILE");
        String fileName = userprofile + "\\Desktop\\temp\\temp.txt";
        Path path = Paths.get(fileName);
        int lineCount = 0;
        ArrayList[] list;
        
        
        try{
            lineCount = (int) Files.lines(path).count();
        }
        catch(IOException ex){
        }
        
        list = new ArrayList[lineCount];
        try {
            File file = new File(fileName);
            Scanner in = new Scanner(file);
            while(in.hasNext()){
                for(int i=0;i<list.length;i++){
                    list[i] = new ArrayList<>();
                    firstName = in.next();
                    mi = in.next();
                    lastName = in.next();
                    fullName = firstName + " " + mi + " " + lastName;
                    phoneNumber = in.next();
                    emailAddress = in.next();
                    date = in.next();
                    in.nextLine();
                    list[i].add(fullName);
                    list[i].add(phoneNumber);
                    list[i].add(emailAddress);
                    list[i].add(date);
                 
                    
                }
            }
        }
        catch(IOException e){
            System.out.print(e);
        }
        return list;
    }
}