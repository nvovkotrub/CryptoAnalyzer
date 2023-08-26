import java.util.regex.Pattern;
public class BruteForce {
    public static String bruteForse(String encryptedText) {
        for (int key = 1; key < Alphabet.ALPHABET.length(); key++) {
            String decryptedText = Decryptor.decrypt(encryptedText, key);
            if (isValidDecryption(decryptedText) && hasCommonWord(decryptedText)) {
                return decryptedText;
            }
        }
        return null;
    }
    private static boolean isValidDecryption(String decryptedText) {
        return hasValidCapitalization(decryptedText) && hasCommonWord(decryptedText);
    }
    private static boolean hasValidCapitalization(String text) {
        String pattern = "\\. [А-Я]";
        return Pattern.compile(pattern).matcher(text).find();
    }
    private static boolean hasCommonWord(String text) {
        String pattern = "\\b(что|на|или)\\b";
        return Pattern.compile(pattern).matcher(text).find();
    }
}