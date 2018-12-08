/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package piratebay;


import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Scanner;


/**
 *
 * @author kdog0
 */
public class Piratebay {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     * @throws java.lang.InterruptedException
     */
    public static void main(String[] args) throws IOException, InterruptedException {
        clearScreen();
        int choice;
        int yn;
        boolean goodChoice = false, cont = true;
        Scanner in = new Scanner(System.in);
        while(cont == true){
            while(goodChoice == false){
                System.out.println("Games [1]");
                System.out.println("TV Shows [2]");
                System.out.println("Movies [3]");
                System.out.println("Books [4]");
                System.out.print("Enter number 1-4 or 0 to end: ");
                choice = in.nextInt();
                if(choice >= 0 && choice < 5){
                    goodChoice = true;
                    switch (choice) {
                        case 0:
                            cont = false;
                            break;
                        case 1:
                            games();
                            promptEnter();
                            clearScreen();
                            break;
                        case 2:
                            tvShows();
                            promptEnter();
                            clearScreen();
                            break;
                        case 3:
                            movies();
                            promptEnter();
                            clearScreen();
                            break;
                        case 4:
                            books();
                            promptEnter();
                            clearScreen();
                            break;
                        default:
                            break;
                    }
                }
                else
                    System.out.print("Enter number 1-5 or 0 to end: ");
            }
            goodChoice = false;
        }
    }
    
    public static void promptEnter(){
        System.out.println("Press \"ENTER\" to continue...");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
    }
    
    public static void clearScreen() throws IOException, InterruptedException {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
    }
    
    public static void games(){
        System.out.print("Input game: ");
        Scanner input = new Scanner(System.in);
        String game = input.nextLine();
        game = game.replaceAll("\\s+","%20");
        String url = "http://thepiratebay.org/search/" + game + "/0/7/400";
        System.out.println(url);
        Browser.main(url);
    }
    
    public static void movies(){
        System.out.print("Input movie: ");
        Scanner input = new Scanner(System.in);
        String search = input.nextLine();
        search = search.replaceAll("\\s+","%20");
        String url = "http://thepiratebay.org/search/" + search + "/0/7/207";
        System.out.println(url);
        Browser.main(url);
    }
    
    public static void tvShows(){
        System.out.print("Input TV Show (i.e. Friends s01e15): ");
        Scanner input = new Scanner(System.in);
        String search = input.nextLine();
        search = search.replaceAll("\\s+","%20");
        String url = "http://thepiratebay.org/search/" + search + "/0/7/208";
        System.out.println(url);
        Browser.main(url);
    }
    
    public static void books(){
        System.out.print("Input book: ");
        Scanner input = new Scanner(System.in);
        String search = input.nextLine();
        search = search.replaceAll("\\s+","%20");
        String url = "http://thepiratebay.org/search/" + search + "/0/7/601";
        System.out.println(url);
        Browser.main(url);
    }
    
    
}


class Browser {
    public static void main(String url) {
//        url = "http://thepiratebay.org/search/" + u;

        if(Desktop.isDesktopSupported()){
            Desktop desktop = Desktop.getDesktop();
            try {
                desktop.browse(new URI(url));
            }
            catch (IOException | URISyntaxException e) {
            }
        }
        else{
            Runtime runtime = Runtime.getRuntime();
            try {
                runtime.exec("xdg-open " + url);
            }
            catch (IOException e) {
            }
        }
    }
}