import java.util.Scanner;
public class CeasarCipher {
    private final Scanner scanner = new Scanner(System.in);
    public void encryptText() {
        System.out.println("Enter encryption key: ");
        int key = scanner.nextInt();
        scanner.nextLine();
        String inpytText = FileManager.readFile("text.txt");
        String encryptedText = Encryptor.encrypt(inpytText, key);
        FileManager.writeFile("encrypted.txt", encryptedText);
        System.out.println("Text encrypted and saved as 'encrypted.txt'");
    }
    public void decryptTextKey() {
        System.out.println("Enter encryption key: ");
        int key = scanner.nextInt();
        scanner.nextLine();
        String encryptedText = FileManager.readFile("encrypted.txt");
        String decryptedText = Decryptor.decrypt(encryptedText, key);
        FileManager.writeFile("decrypted.txt", decryptedText);
        System.out.println("Text decrypted and saved as 'decrypted.txt'");
    }
    public void decryptBruteForce() {
        String encryptedText = FileManager.readFile("encrypted.txt");
        String bruteForceDecryptedText = BruteForce.bruteForse(encryptedText);
        if (bruteForceDecryptedText != null) {
            FileManager.writeFile("BruteForse.txt", bruteForceDecryptedText);
            System.out.println("Text decrypted using BruteForce and saved as 'BruteForse.txt'");
        } else {
            System.out.println("BruteForce decryption was unsuccessful.");
        }
    }
}