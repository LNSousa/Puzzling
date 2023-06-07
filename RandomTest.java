import java.util.Random;
import java.util.ArrayList;

public class RandomTest {
    public static void main(String[] args) {
        RandUtil randMachine = new RandUtil();
        System.out.println("Array of 10 random numbers:");
        System.out.println(randMachine.getTenRolls());

        System.out.println("\nRandom letter of the alphabet:");
        System.out.println(randMachine.getRandomLetter());

        System.out.println("\nRandom password:");
        System.out.println(randMachine.generatePassword());

        System.out.println("\nRandom password set:");
        System.out.println(randMachine.getNewPasswordSet(4));

        System.out.println("\nShuffle array:");
        ArrayList<Object> arrToBeShuffled = new ArrayList<Object>();
        arrToBeShuffled.add("Hello");
        arrToBeShuffled.add("World");
        arrToBeShuffled.add(42);
        arrToBeShuffled.add(2);
        arrToBeShuffled.add("Orange");
        System.out.println(randMachine.shuffleArray(arrToBeShuffled));


    }
}