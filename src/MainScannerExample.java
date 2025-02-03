//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class MainScannerExample {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Scanner s = new Scanner(System.in);
        int[] n = new int [3];
        n[0] = s.nextInt();
        n[1] = s.nextInt();
        n[2] = s.nextInt();

        System.out.print("Sum of the numbers = ");

        System.out.println(n[0]+n[1]+n[2]);
    }
}