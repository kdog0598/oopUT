/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package writetest;

import java.io.*;
import java.util.Arrays;

public class WriteTest {
    public static void main(String[] args) {
        String name = "Kieran Wilson";
        String phone_number = "9374782718";
        String email = "email123";
        String address = null;
        String job = null;
        String nickname = null;
        write.main(name, phone_number, email,address,job,nickname);
        read.main();
    }
}

class write {
    public static void main(String name, String phone_number, String email,String address,String job,String nickname) {

//        String userprofile is the users home profile i.e. "C:\Users\kwilson38\"
        String userprofile = System.getenv("USERPROFILE");
        String fileName = userprofile + "\\Desktop\\temp\\temp.txt";

        try {
            FileWriter fileWriter = new FileWriter(fileName, true);

            // Always wrap FileWriter in BufferedWriter.
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            
            bufferedWriter.write(name + "," + phone_number + "," + email + "," + address + "," + job + "," + nickname);
            bufferedWriter.newLine();

            // Always close files.
            bufferedWriter.close();
        }
        catch(IOException ex) {
            System.out.println("Error writing to file '" + fileName + "'");
        }
    }
}
class read {
    public static void main(){
        String userprofile = System.getenv("USERPROFILE");
        String fileName = userprofile + "\\Desktop\\temp\\temp.txt";
        try {
            FileReader fileReader = new FileReader (fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String in;
            while ((in = bufferedReader.readLine()) != null) {
//                String[] ab = in
//                System.out.println(in);
                String[] ar = in.split(",");
                System.out.println(Arrays.toString(ar));
                System.out.println(ar[1]);
                
            }
        }
        catch(IOException ex) {
            System.out.println("Error writing to file '" + fileName + "'");
        }
    }
}