package newpackage;

import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        String s;   //Variable for Scanner
        ReadWord P = new ReadWord();    //Variable for ReadWord Class
        String[] word;  //Array of String that will keep the String
        double Token;   //Variable to check the pattern of word

        //will ask the user to input the data
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string or type OUT");
        s = in.nextLine();
        
        //Looping until the user input "OUT" into the program
        while (!"OUT".equals(s)){
            
            //Split the String into Array of String
            word = P.Split(s);
            
            //Find the pattern of the word that has been inputed by user
            Token = P.WordPattern(word);
            
            //will search whether the Statement is acceptance or not. 
            P.SeekForAcceptence(Token);
            
            //will ask the user to input the data again
            in = new Scanner(System.in);
            System.out.println("");
            System.out.println("===============================");
            System.out.println("Enter a string or type OUT");
            s = in.nextLine();
        }
    }
}
