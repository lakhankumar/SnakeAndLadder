import java.util.concurrent.ThreadLocalRandom;

public class SnakeAndLadder {

	public static void main(String[] args) {
			System.out.println("Welcome to Snake and Ladder Game!!!");
	        int START_POSITION= 0;
	        int currentPosition = 0;
	        int NO_PLAY = 0;
	        int LADDER = 1;
	        int SNAKE = 2;
	        System.out.println("The initial position of a player is : "+START_POSITION);
	        
	        for(int i =1;i<=10;i++){
	            int diceNumber = ThreadLocalRandom.current().nextInt(1,6);
	            int nextMove = ThreadLocalRandom.current().nextInt(0, 2);
	            System.out.println("Random dice number generated is : "+diceNumber);
	            
	            if(nextMove == NO_PLAY){
	                System.out.println("Sorry you can not Play,You are at the Same Position");
	                
	            }
	            else if(nextMove == LADDER){
	                System.out.println("You have got the ladder");
	                currentPosition = currentPosition + diceNumber;
	            }
	            else if (nextMove ==  SNAKE){
	                System.out.println("ITS a SNAKE");
	                
	                if(currentPosition != 0) {
	                    currentPosition = currentPosition - diceNumber;
	                }
	            }
	         System.out.println("The current position of a player is: "+currentPosition);
		}
	}

}
