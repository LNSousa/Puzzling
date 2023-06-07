import java.util.Random;
import java.util.ArrayList;

public class RandUtil {
    Random rand = new Random();
    
    public ArrayList<Integer> getTenRolls() {
        ArrayList<Integer> nums = new ArrayList<Integer>();

        for (int i = 0; i < 10; i++) {
            int randInt = rand.nextInt(20)+1;
            nums.add(randInt);
        }
        return nums;
    }

    public char getRandomLetter() {
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        int randInt = rand.nextInt(26);
        return alphabet[randInt];
    }

    public String generatePassword() {
        String password = new String();
        for (int i = 0; i < 8; i++) {
            password += String.valueOf(getRandomLetter());
        }
        return password;
    }

    public ArrayList<String> getNewPasswordSet(int length) {
        ArrayList<String> passwords = new ArrayList<String>();
        for (int i = 0; i < length; i++) {
            passwords.add(generatePassword());
        }
        return passwords;
    }

    public ArrayList<Object> shuffleArray(ArrayList<Object> arr) {
        for (int i = 0; i < arr.size(); i++) {
            int randIndex = rand.nextInt(arr.size());
            Object tempVar = arr.get(randIndex);
            arr.set(randIndex, arr.get(i));
            arr.set(i, tempVar);
        }
        return arr;
    }
}