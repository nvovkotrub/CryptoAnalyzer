public class Encryptor {
    private static char encryptChar(char c, int key) {
        int index = Alphabet.ALPHABET.indexOf(c);
        if (index != -1) {
            int shiftedIndex = (index + key) % Alphabet.ALPHABET.length();
            return Alphabet.ALPHABET.charAt(shiftedIndex);
        }
        return c;
    }
    public static String encrypt(String text, int key) {
        StringBuilder encryptedText = new StringBuilder();
        for (char c : text.toCharArray()) {
            encryptedText.append(encryptChar(c, key));
        }
        return encryptedText.toString();
    }
}