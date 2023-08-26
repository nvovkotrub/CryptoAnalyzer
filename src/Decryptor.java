public class Decryptor {
    private static char decryptChar(char c, int key) {
        int index = Alphabet.ALPHABET.indexOf(c);
        if (index != -1) {
            int shiftedIndex = (index - key + Alphabet.ALPHABET.length()) % Alphabet.ALPHABET.length();
            return Alphabet.ALPHABET.charAt(shiftedIndex);
        }
        return c;
    }
    public static String decrypt(String encryptedText, int key) {
        StringBuilder decryptedText = new StringBuilder();
        for (char c : encryptedText.toCharArray()) {
            decryptedText.append(decryptChar(c, key));
        }
        return decryptedText.toString();
    }
}