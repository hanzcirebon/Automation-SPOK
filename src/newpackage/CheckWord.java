package newpackage;

/* in this CheckWord Class, will only return true if the char of string is
 * Subjek : saya, aku, kamu, mereka, ibu
 * predikat : makan, belajar, minum, pergi, bermain
 * objek : nasi, jus, tba, bola, mie
 * keterangan : didapur, diGOR, dilab, kecafe, kepasar
 * anything beside that will send as false.
*/

public class CheckWord {
    
    /*This Function will Search whether the char has Subject or not, if yes it will send true otherwise false*/
    public boolean Subject(char[] word){
        int i = 0;
        
        /*first if is searching if the word of char is "saya" and will send true, otherwise send false*/
        if ((word[i] == 'S' || word[i] == 's') && word.length == 4) {
            i++;
            if (word[i] == 'a' || word[i] == 'A'){
                i++;
                if (word[i] == 'y' || word[i] == 'Y'){
                    i++;
                    if (word[i] == 'a' || word[i] == 'A'){
                        return true;
                    }else {
                        return false;
                    }
                }else {
                    return false;
                }
            }else {
                return false;
            }
            
        /*second if is searching if the word of char is "aku" and will send true, otherwise send false*/
        }else if ((word[i] == 'a' || word[i] == 'A') && word.length == 3){
            i++;
            if (word[i] == 'k' || word[i] == 'K'){
                i++;
                if (word[i] == 'u' || word[i] == 'U'){
                    return true;
                }else {
                    return false;
                }
            }else {
                return false;
            }
            
        /*third if is searching if the word of char is "kamu" and will send true, otherwise send false*/
        }else if ((word[i] == 'k' || word[i] == 'K') && word.length == 4){
            i++;
            if (word[i] == 'a' || word[i] == 'A'){
                i++;
                if (word[i] == 'm' || word[i] == 'M'){
                    i++;
                    if (word[i] == 'u' || word[i] == 'U'){
                        return true;
                    }else {
                        return false;
                    }
                }else {
                    return false;
                }
            }else {
                return false;
            }
            
        /*forth if is searching if the word of char is "mereka" and will send true, otherwise send false*/
        }else if ((word[i] == 'm' || word[i] == 'M') && word.length == 6){
            i++;
            if (word[i] == 'e' || word[i] == 'E'){
                i++;
                if (word[i] == 'r' || word[i] == 'R'){
                    i++;
                    if (word[i] == 'e' || word[i] == 'E'){
                        i++;
                        if (word[i] == 'k' || word[i] == 'K'){
                            i++;
                            if (word[i] == 'a' || word[i] == 'A'){
                                return true;
                            }else{
                                return false;
                            }
                        }else{
                            return false;
                        }
                    }else{
                        return false;
                    }
                }else{
                    return false;
                }
            }else{
                return false;
            }
            
        /*fifth if is searching if the word of char is "ibu" and will send true, otherwise send false*/
        }else if ((word[i] == 'i' || word[i] == 'I') && word.length == 3){
            i++;
            if (word[i] == 'b' || word[i] == 'B'){
                i++;
                if (word[i] == 'u' || word[i] == 'U'){
                    return true;
                }else{
                    return false;
                }
            }else{
                return false;
            }
        }else {
            return false;
        }
    }
    
    /*This Function will Search whether the char has Predikat or not, if yes it will send true otherwise false*/
    public boolean Predikat (char[] word){
        int i = 0;
        
        /*first if is searching if the word of char is "m" and go to the next if, otherwise send false*/
        if ((word[i] == 'm' || word[i] == 'M') && word.length == 5){
            i++;
            
            /*this if's is searching if the word of char is "akan" and combined with "m" become "makan"
            and will send true, otherwise send false*/
            if (word[i] == 'a' || word[i] == 'A'){
                i++;
                if (word[i] == 'k' || word[i] == 'K'){
                    i++;
                    if(word[i] == 'a' || word[i] == 'A'){
                        i++;
                        if (word[i] == 'n' || word[i] == 'N'){
                            return true;
                        }else{
                            return false;
                        }
                    }else{
                        return false;
                    }
                }else{
                    return false;
                }
                
            /*this if's is searching if the word of char is "inum" and combined with "m" become "makan"
            and will send true, otherwise send false*/
            }else if (word[i] == 'i' || word[i] == 'I'){
                i++;
                if (word[i] == 'n' || word[i] == 'N'){
                    i++;
                    if(word[i] == 'u' || word[i] == 'U'){
                        i++;
                        if (word[i] == 'm' || word[i] == 'M'){
                            return true;
                        }else{
                            return false;
                        }
                    }else{
                        return false;
                    }
                }else{
                    return false;
                }
            }else{
                return false;
            }
            
        /*second if is searching if the word of char is "belajar" and send true, otherwise send false*/
        }else if ((word[i] == 'b' || word[i] == 'B') && word.length == 7){
            i++;
            if (word[i] == 'e' || word[i] == 'E'){
                i++;
                if (word[i] == 'l' || word[i] == 'L'){
                    i++;
                    if (word[i] == 'a' || word[i] == 'A'){
                        i++;
                        if (word[i] == 'j' || word[i] == 'J'){
                            i++;
                            if (word[i] == 'a' || word[i] == 'A'){
                                i++;
                                if (word[i] == 'r' || word[i] == 'A'){
                                    return true;
                                }else{
                                    return false;
                                }
                            }else{
                                return false;
                            }
                        }else{
                            return false;
                        }
                    }else{
                        return false;
                    }
                    
                /*forth if is searching if the word of char is "bermain" and send true, otherwise send false*/
                }else if (word[i] == 'r' || word[i] == 'R'){
                    i++;
                    if (word[i] == 'm' || word[i] == 'M'){
                        i++;
                        if (word[i] == 'a' || word[i] == 'A'){
                            i++;
                            if (word[i] == 'i' || word[i] == 'I'){
                                i++;
                                if (word[i] == 'n' || word[i] == 'N'){
                                    return true;
                                }else{
                                    return false;
                                }
                            }else{
                                return false;
                            }
                        }else{
                            return false;
                        }
                    }else{
                        return false;
                    }
                }else{
                    return false;
                }
            }else {
                return false;
            }
                
        /*third if is searching if the word of char is "pergi" and send true, otherwise send false*/
        }else if ((word[i] == 'p' || word[i] == 'P') && word.length == 5){
            i++;
            if (word[i] == 'e' || word[i] == 'E'){
                i++;
                if (word[i] == 'r' || word[i] == 'R'){
                    i++;
                    if(word[i] == 'g' || word[i] == 'G'){
                        i++;
                        if (word[i] == 'i' || word[i] == 'I'){
                            return true;
                        }else{
                            return false;
                        }
                    }else{
                        return false;
                    }
                }else{
                    return false;
                }
            }else{
                return false;
            }
        }else {
            return false;
        }
    }
    
    /*This Function will Search whether the char has Objek or not, if yes it will send true otherwise false*/
    public boolean Objek (char[] word){
        int i = 0;
        
        /*first if is searching if the word of char is "nasi" and will send true, otherwise send false*/
        if ((word[i] == 'n' || word[i] == 'N') && word.length == 4) {
            i++;
            if (word[i] == 'a' || word[i] == 'A'){
                i++;
                if (word[i] == 's' || word[i] == 'S'){
                    i++;
                    if(word[i] == 'i' || word[i] == 'I'){
                        return true;
                    }else{
                        return false;
                    }
                }else{
                    return false;
                }
            }else{
                return false;
            }
            
        /*second if is searching if the word of char is "jus" and will send true, otherwise send false*/
        }else if ((word[i] == 'j' || word[i] == 'J') && word.length == 3){
            i++;
            if (word[i] == 'u' || word[i] == 'U'){
                i++;
                if (word[i] == 's' || word[i] == 'S'){
                    return true;
                }else{
                    return false;
                }
            }else{
                return false;
            }
            
        /*third if is searching if the word of char is "tba" and will send true, otherwise send false*/
        }else if ((word[i] == 't' || word[i] == 'T') && word.length == 3){
            i++;
            if (word[i] == 'b' || word[i] == 'B'){
                i++;
                if (word[i] == 'a' || word[i] == 'A'){
                    return true;
                }else{
                    return false;
                }
            }else{
                return false;
            }
            
        /*forth if is searching if the word of char is "bola" and will send true, otherwise send false*/
        }else if ((word[i] == 'b' || word[i] == 'B') && word.length == 4) {
            i++;
            if (word[i] == 'o' || word[i] == 'O'){
                i++;
                if (word[i] == 'l' || word[i] == 'L'){
                    i++;
                    if(word[i] == 'a' || word[i] == 'A'){
                        return true;
                    }else{
                        return false;
                    }
                }else{
                    return false;
                }
            }else{
                return false;
            }
            
        /*fifth if is searching if the word of char is "mie" and will send true, otherwise send false*/
        }else if ((word[i] == 'm' || word[i] == 'M') && word.length == 4) {
            i++;
            if (word[i] == 'i' || word[i] == 'I'){
                i++;
                if (word[i] == 'e' || word[i] == 'E'){
                    return true;
                }else{
                    return false;
                }
            }else{
                return false;
            }
        }else {
            return false;
        }
    }
    
    /*This Function will Search whether the char has Keterangan or not, if yes it will send true otherwise false*/
    public boolean Keterangan (char[] word){
        int i = 0;
        
        /*first if will search wether the char is "di " and go to the next if, otherwise send false*/
        if ((word[i] == 'd' || word[i] == 'D') && (word.length == 5 || word.length == 7)){
            i++;
            if (word[i] == 'i' || word[i] == 'I'){
                i++;
                
                            
                    /*will search wether the char is "dapur" and send true, otherwise send false*/
                    if (word[i] == 'd' || word[i] == 'D'){
                        i++;
                        if (word[i] == 'a' || word[i] == 'A'){
                            i++;
                            if (word[i] == 'p' || word[i] == 'P'){
                                i++;
                                if (word[i] == 'u' || word[i] == 'U'){
                                    i++;
                                    if (word[i] == 'r' || word[i] == 'R'){
                                        return true;
                                    }else{
                                    return false;
                                    }
                                }else{
                                    return false;
                                }
                            }else {
                                return false;
                            }
                        }else {
                            return false;
                        }
                
                    /*will search wether the char is "gor" and send true, otherwise send false*/
                    }else if (word[i] == 'g' || word[i] == 'G'){
                        i++;
                        if (word[i] == 'o' || word[i] == 'O'){
                            i++;
                            if (word[i] == 'r' || word[i] == 'R'){
                                return true;
                            }else {
                                return false;
                            }
                        }else{
                            return false;
                        }
                        
                    /*will search wether the char is "lab" and send true, otherwise send false*/
                    }else if (word[i] == 'l' || word[i] == 'L'){
                        i++;
                        if (word[i] == 'a' || word[i] == 'A'){
                            i++;
                            if (word[i] == 'b' || word[i] == 'B'){
                                return true;
                            }else {
                                return false;
                            }
                        }else{
                            return false;
                        }
                    }else {
                        return false;
                    }
                
            }else {
                return false;
            }
            
        /*second if will search wether the char is "ke " and go to the next if, otherwise send false*/
        }else if ((word[i] == 'k' || word[i] == 'K') && (word.length == 6 || word.length == 7)){
            i++;
            if (word[i] == 'e' || word[i] == 'E'){
                i++;
                    
                    /*will search wether the char is "pasar" and send true, otherwise send false*/
                    if (word[i] == 'p' || word[i] == 'P'){
                        i++;
                        if (word[i] == 'a' || word[i] == 'A'){
                            i++;
                            if (word[i] == 's' || word[i] == 'S'){
                                i++;
                                if (word[i] == 'a' || word[i] == 'A'){
                                i++;
                                if (word[i] == 'r' || word[i] == 'R'){
                                    return true;
                                }else{
                                    return false;
                                }
                            }else{
                                return false;
                            }
                        }else {
                            return false;
                        }
                    }else {
                        return false;
                    }
                
                    /*will search wether the char is "cafe" and send true, otherwise send false*/
                    }else if (word[i] == 'c' || word[i] == 'C'){
                        i++;
                        if (word[i] == 'a' || word[i] == 'A'){
                            i++;
                            if (word[i] == 'f' || word[i] == 'F'){
                                i++;
                                if (word[i] == 'e' || word[i] == 'E'){
                                    return true;
                                }else{
                                    return false;
                                }
                            }else {
                                return false;
                            }
                        }else {
                            return false;
                        }
                    }else {
                        return false;
                    }
            }else{
                return false;
            }
        }else{
            return false;
        }
    }
}