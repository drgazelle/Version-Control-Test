import java.util.*;
/**
 * VCSDriver class is the main method that calls upon
 * a subclass
 */
public class VCSDriver {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Phrase");
        String i = input.nextLine();
        HelloWorld.setPhrase(i);
        System.out.println(HelloWorld.getPhrase());
    }
}
