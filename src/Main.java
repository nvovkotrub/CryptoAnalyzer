import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ConsoleMenu consoleMenu = new ConsoleMenu();
        CeasarCipher ceasarCipher = new CeasarCipher();
        while (true) {
            consoleMenu.showMenu();
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1 -> ceasarCipher.encryptText();
                case 2 -> ceasarCipher.decryptTextKey();
                case 3 -> ceasarCipher.decryptBruteForce();
                case 4 -> {
                    System.out.println("Goodbay!");
                    System.exit(0);
                }
                default -> System.out.println("Invalid choice. Please select again.");
            }
        }
    }
}