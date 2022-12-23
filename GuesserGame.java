import java.util.Scanner;

class Guesser{
	int guessNum;
	int guessNumber() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Guesser, kindly guess and enter a number between 1-10");
		guessNum = sc.nextInt();
		while(guessNum >10) {
			System.out.println("Guesser, Please enter the number from the mentioned range [1-10]");
			guessNum = sc.nextInt();			
		}
		return guessNum;

	}
}

class Player{
	int pGuessNum;
	int pGuessNumber() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Player, kindly guess and enter a number between 1-10");
		pGuessNum = sc.nextInt();
		while(pGuessNum >10) {
			System.out.println("Player, Please enter the number from the mentioned range [1-10]");
			pGuessNum = sc.nextInt();			
		}
		return pGuessNum;
	}
}

class Umpire{
	
	int numFromGuesser;
	int numFromPlayer1;
	int numFromPlayer2;
	int numFromPlayer3;
	
	public void collectNumFromGuesser(){
		Guesser g = new Guesser();
		numFromGuesser = g.guessNumber();
	}
	
	public void collectNumFromPlayer(){
		Player p1 = new Player();
		Player p2 = new Player();
		Player p3 = new Player();

		numFromPlayer1 = p1.pGuessNumber();
		numFromPlayer2 = p2.pGuessNumber();
		numFromPlayer3 = p3.pGuessNumber();
	}
	
	public void compare() {
		if(numFromGuesser == numFromPlayer1) {
			if(numFromGuesser == numFromPlayer2 && numFromGuesser == numFromPlayer3)
			{
				System.out.println("Game tied all three players guessed correctly");
			}
			else if(numFromGuesser == numFromPlayer2)
			{
				System.out.println("Player1 and Player2 won the game");
			}
			else if(numFromGuesser == numFromPlayer3)
			{
				System.out.println("Player1 and Player3 won ");
			}
			else
			{
			
			System.out.println("Player1 won the game");
			}
		}
		
		
		else if(numFromGuesser == numFromPlayer2)
		{
			
			if(numFromGuesser == numFromPlayer3)
			{
			System.out.println("Player2 and Player3 won the game");
			}
			else
			{
				System.out.println("Player2 won the game");
			}
		}
		
		
		
		else if(numFromGuesser == numFromPlayer3)
		{
			System.out.println("Player 3 won the game");
		}
		else
		{
			System.out.println("Game lost! try again");
		}
	}

}

public class GuesserGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c;
		do {
		Umpire u = new Umpire();
		u.collectNumFromGuesser();
		u.collectNumFromPlayer();
		u.compare();
		System.out.println("Do you want to play again?");
		System.out.println("Enter y to play, else any other letter to terminate the game: ");
		Scanner sc = new Scanner(System.in);
		c = sc.next().charAt(0);
		
		}while(c == 'y');
	}

}
