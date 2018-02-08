import java.util.Scanner;

public class Crypto{
    public static void main(String[] args){
        String message = greet();
        String message_en = encryptString(message,2,2);
        System.out.println(message_en);
    }
    public static String greet(){
        Scanner input = new Scanner(System.in);
        System.out.print("What is your name? ");
        String name = input.nextLine();
        System.out.println("Hello "+name+". Please enter your message.");
        String message = input.nextLine();
        return message;
    }
    public static String encryptString(String message, int shift, int grp_size){
        String message_norm = normalizeText(message);
        String message_ob = obify(message_norm);
        String message_ce = ceaserify(message_ob,shift);
        String message_gr = groupify(message_ce,grp_size);
        return message_gr;    
    }
    public static String normalizeText(String message){
        message = message.replaceAll("\\W","");
        message = message.toUpperCase();
        return message;
    }
    public static String obify(String message){
        message = message.replaceAll("O","OBO");
        message = message.replaceAll("A","OBA");
        message = message.replaceAll("E","OBE");
        message = message.replaceAll("I","OBI");
        message = message.replaceAll("U","OBU");
        return message;
    }
    /*public static String unobify(String message){
        message = message.replaceAll("OBA","A");
        message = message.replaceAll("OBE","E");
        message = message.replaceAll("OBI","I");
        message = message.replaceAll("OBO","O");
        message = message.replaceAll("OBU","U");
        return message;
    }*/
    public static String shiftAlphabet(int shift) {
        int start = 0;
        if (shift < 0) {
            start = (int) 'Z' + shift + 1;
        } 
        else {
            start = 'A' + shift;
        }
        String result = "";
        char currChar = (char) start;
        for(; currChar <= 'Z'; ++currChar) {
            result = result + currChar;
        }
        if(result.length() < 26) {
            for(currChar = 'A'; result.length() < 26; ++currChar) {
                result = result + currChar;
            }
        }
        return result;
    }
    public static String ceaserify(String message, int shift){
        String alphabet = shiftAlphabet(2);
        int len = message.length();
        String result = "";
        for(int i = 0 ; i <len; i++){
            result += String.valueOf(alphabet.charAt(message.charAt(i)-'A'));
        }
        return result;
    }
    public static String groupify(String message, int grp_size){
        int len = message.length();
        String result = "";
        for(int i = 0; i<len;){
            for(int count = 0; count<grp_size; count++,i++){
                if(i>=len){
                    result+="x";
                }
                else
                    result += String.valueOf(message.charAt(i));
            }
            result+=" ";
        }
        return result;
    }
}