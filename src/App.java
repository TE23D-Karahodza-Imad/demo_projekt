import java.util.Scanner;
import java.util.Random;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random numberGenerator = new Random();

        int randomNumber = numberGenerator.nextInt(10) + 1; // 1-10
        int försök = 3;
        boolean gissadeRätt = false;

        System.out.println("Du ska gissa ett tal mellan 1-10, du har 3 försök!");

        for (int i = 1; i <= försök; i++) {
            System.out.print("Försök " + i + "Ange ett tal: ");
            int gissning = scanner.nextInt();
            if (gissning == randomNumber) {
                System.out.println("Rätt gissat! Talet var " + randomNumber);
                gissadeRätt = true;
                break; // Avsluta loopen om man gissar rätt
            } else {
                System.out.println("Fel gissat!");
            }
        }


        scanner.close();
    }
}