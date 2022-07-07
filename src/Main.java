import java.util.Scanner;
import com.Palindrome.Palindrome;

public class Main {
    public static void main(String[] args) {
        System.out.println("Type word");
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();
        System.out.println(Palindrome.isPalindrome(word));
        scan.close();
    }
}