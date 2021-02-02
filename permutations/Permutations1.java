import java.util.Scanner;

public class Permutations1 {

    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);
        String numbers = enter.nextLine();

        PClass pc = new PClass();
        pc.parse(numbers);
        enter.close();

    }

}