package recursion;

public class PrintStringReverse {
    public static void main(String[] args) {
        printReverse("Good Morning",11);
    }



    static void printReverse(String word, int n){
        if(!(n == word.length() || n < 0)){
            System.out.print(word.charAt(n));
            printReverse(word,n-1);
        }
    }
}
