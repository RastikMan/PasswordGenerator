package passwordGenerator;

import java.util.Random;

public class GeneratePasswordByLength {
    private static final String LOWERCASE = "abcdefghijklmnopqrstuvwxyz";
    private static final String UPPERCASE = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String DIGITS = "0123456789";
    private static final String SPECIAL_CHARACTERS = "!@#$%^&*()-_=+";

    public static String generatePassword(int length, boolean useUppercase, boolean useDigits, boolean useSpecialCharacters) {
        StringBuilder characters = new StringBuilder(LOWERCASE);
        if (useUppercase) characters.append(UPPERCASE);
        if (useDigits) characters.append(DIGITS);
        if (useSpecialCharacters) characters.append(SPECIAL_CHARACTERS);

        Random random = new Random();
        StringBuilder password = new StringBuilder();

        for (int i = 0; i < length; i++) {
            int index = random.nextInt(characters.length());
            password.append(characters.charAt(index));
        }

        return password.toString();
    }
}
