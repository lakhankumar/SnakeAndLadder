import java.util.concurrent.ThreadLocalRandom;

public class SnakeAndLadder {

	public static void main(String[] args) {
			System.out.println("Welcome to Snake and Ladder Game!!!");
	        int startPosition= 0;
	        int player1Position = 0,player2Position = 0;
	        int noPlay = 0;
	        int ladder = 1;
	        int snake = 2;
	        int winningPosition = 100;
	        int player1count = 0,player2count = 0, totalRoll=0;
	        
	       // System.out.println("The initial position of a player is : "+startPosition);
	        
	        while(player1Position<=winningPosition){
	        	player1count++;
	            int diceNumber = ThreadLocalRandom.current().nextInt(1,6);
	            int nextMove = ThreadLocalRandom.current().nextInt(0, 2);
	           // System.out.println("Random dice number generated is : "+diceNumber);
	            
	            if(nextMove == noPlay){
	              //  System.out.println("Sorry you can not Play,You are at the Same Position");
	                
	            }
	            else if(nextMove == ladder){
	               // System.out.println("You have got the ladder");
	                player1Position += diceNumber;
	            }
	            else if (nextMove ==  snake){
	               // System.out.println("ITS a SNAKE");
	                
	                if(player1Position != 0) {
	                	player1Position -= diceNumber;
	                }
	            }
	            if (player1Position > winningPosition) {
	            	player1Position = player1Position - diceNumber;
	            }else if (player1Position == winningPosition){
	                //System.out.println("The current position of a player is: "+player1Position);
	                break;
	            }
	         //System.out.println("The current position of a player is: "+player1Position);
		}
	        //System.out.println("The total no.of times dice was rolled is : "+player1count);
	        
	        
	        //player 2
	        
	        while(player2Position<=winningPosition){
	        	player2count++;
	            int diceNumber = ThreadLocalRandom.current().nextInt(1,6);
	            int nextMove = ThreadLocalRandom.current().nextInt(0, 2);
	            //System.out.println("Random dice number generated is : "+diceNumber);
	            
	            if(nextMove == noPlay){
	                //System.out.println("Sorry you can not Play,You are at the Same Position");
	                
	            }
	            else if(nextMove == ladder){
	               // System.out.println("You have got the ladder");
	                player2Position += diceNumber;
	            }
	            else if (nextMove ==  snake){
	                //System.out.println("ITS a SNAKE");
	                
	                if(player2Position != 0) {
	                	player2Position -= diceNumber;
	                }
	            }
	            if (player2Position > winningPosition) {
	            	player2Position = player2Position - diceNumber;
	            }else if (player2Position == winningPosition){
	                //System.out.println("The current position of a player is: "+player2Position);
	                break;
	            }
	         //System.out.println("The current position of a player is: "+player2Position);
		}
	       // System.out.println("The total no.of times dice was rolled is : "+player2count);
	        
	        if(player1Position == winningPosition) {
	        	System.out.println("player 1 is the winner***");
	        }
	        else if(player2Position == winningPosition) {
	        	System.out.println("player 2 is the winner***");
	        }
	        totalRoll = player1count+player2count;
	        System.out.println(totalRoll);
	}

}
