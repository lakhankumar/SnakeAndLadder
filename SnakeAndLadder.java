import java.util.concurrent.ThreadLocalRandom;

public class SnakeAndLadder {

	public static void main(String[] args) {
			System.out.println("Welcome to Snake and Ladder Game!!!");
	        int startPosition= 0;
	        int currentPosition = 0;
	        int noPlay = 0;
	        int ladder = 1;
	        int snake = 2;
	        int winningPosition=100;
	        System.out.println("The initial position of a player is : "+startPosition);
	        
	        while(currentPosition<=winningPosition){
	            int diceNumber = ThreadLocalRandom.current().nextInt(1,6);
	            int nextMove = ThreadLocalRandom.current().nextInt(0, 2);
	            System.out.println("Random dice number generated is : "+diceNumber);
	            
	            if(nextMove == noPlay){
	                System.out.println("Sorry you can not Play,You are at the Same Position");
	                
	            }
	            else if(nextMove == ladder){
	                System.out.println("You have got the ladder");
	                currentPosition = currentPosition + diceNumber;
	            }
	            else if (nextMove ==  snake){
	                System.out.println("ITS a SNAKE");
	                
	                if(currentPosition != 0) {
	                    currentPosition = currentPosition - diceNumber;
	                }
	            }
	            if (currentPosition > winningPosition) {
	                currentPosition = currentPosition - diceNumber;
	            }else if (currentPosition == winningPosition){
	                System.out.println("The current position of a player is: "+currentPosition);
	                break;
	            }
	         System.out.println("The current position of a player is: "+currentPosition);
		}
	}

}
