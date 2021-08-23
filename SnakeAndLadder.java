import java.util.concurrent.ThreadLocalRandom;

public class SnakeAndLadder {

	public static void main(String[] args) {
		System.out.println("Welcome to Snake and Ladder Game");
        int startPosition= 0;
        int randomNum = ThreadLocalRandom.current().nextInt(1, 6);
        System.out.println("The initial position of a player is : " +startPosition);
        System.out.println("After rolling a die position of player is at : " +randomNum);
	}

}
