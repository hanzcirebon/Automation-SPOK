package newpackage;

public class ReadWord {
    
    //will split the String of word, into array of String if there's any space " "
    public String[] Split(String A){
        String[] Word = A.split(" ");
        return Word;
    }
    
    //will find the word pattern and return the Token values
    public double WordPattern (String[] word){
        
        //here the boolean value for the data of Subjek, Predikat, Objek, and Keterangan
        boolean foundSubjek = false , foundPredikat = false, foundObjek = false, foundKeterangan = false;
        
        //first token assign, the value is 0.5
        double Token = 0.5;
        
        //create the new variable for CheckWord Class
        CheckWord C = new CheckWord();
        
        //will looping until the last array of String
        for (int i = 0; i < word.length; i++) {
            
            //change the format of each array of string into character value
            char[] word1 = word[i].toCharArray();
            
            /* will find whether the character of array string is Subjek or not,
             * if yes, will search whether the subjeck is already found or not,
             * if not found, then will print out the "S" string and change foundSubjek into true,
             * if already found it will print out error
            */
            if (C.Subject(word1) == true && foundSubjek == false){
                System.out.print("S ");
                foundSubjek = true;
                Token = Token + 5.5;
                
            /* will find whether the character of array string is Predikat or not,
             * if yes, will search whether the subjeck is already found or not,
             * if not found, then will print out the "P" string and change foundPredikat into true,
             * if already found it will print out error
            */
            }else if (C.Predikat(word1) == true && foundPredikat == false){
                System.out.print("P ");
                foundSubjek = true;
                Token = Token * 5;
                
            /* will find whether the character of array string is Objek or not,
             * if yes, will search whether the subjeck is already found or not,
             * if not found, then will print out the "O" string and change foundObjek into true,
             * if already found it will print out error
            */
            }else if (C.Objek(word1) == true && foundObjek == false){
                System.out.print("O ");
                foundSubjek = true;
                Token = Token - 2;
                
            /* will find whether the character of array string is Keterangan or not,
             * if yes, will search whether the subjeck is already found or not,
             * if not found, then will print out the "K" string and change foundKeterangan into true,
             * if already found it will print out error
            */
            }else if (C.Keterangan(word1) == true && foundKeterangan == false){
                System.out.print("K ");
                foundSubjek = true;
                Token = Token / 2;
                
            /* if all the statment above are false, is whether the word doesnt fullfill the rules
             * will output "Err" and change the Token Point into 0.7
            */
            }else {
                System.out.print("Err ");
                Token = 0.7;
            }
        }
        
        return Token;   //return the final number of token
    }
    
    /* will see if the Token are fullfill the rules for acceptance status
     * Acceptance Token values are :
     * 14 if the word pattern is S-P-O-K
     * 28 if the word pattern is S-P-O
     * 15 if the word pattern is S-P-K
     * 30 if the word pattern is S-P
     * anything beside that will not Accepted
    */
    public void SeekForAcceptence(double Token){
        System.out.println("");
        System.out.print("Acceptance Status : ");
        if (Token == 14 || Token == 28 || Token == 15 || Token == 30){
            System.out.print("Accepted");
        }else {
            System.out.print("Not Accepted");
        }
        System.out.println("");
    }
}
