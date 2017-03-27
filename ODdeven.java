import java.util.Scanner;

import javax.swing.JOptionPane;

public class oddeven {
	public static void main(String[] args) {
		int diceroll = 0;
		int evennumber = 0;
		int oddnumber = 0;
		int win = 0;
		int lose = 0;
		int cont = 1;
		int numberofgames = 1;
		int counter = 0;
		int[] Array = { counter };

		long PercentWin = (long) (win / numberofgames * 100);
		int[] Dice = { 1, 2, 3, 4, 5, 6 };
		Scanner input = new Scanner(System.in);
		String playerguess;
		while (cont != 2) {
			for (counter = 0; counter < Array.length; counter++)
				diceroll = 0 + (int) (Math.random() * 6);
			System.out.println("Guess Even Or Odd!");
			playerguess = input.next();
			if (Dice[diceroll] % 2 == 0) {
				System.out.println("The Computer rolled an Even Number");
				evennumber++;
				if (playerguess.equals("even")) {
					System.out.println("You Win");
					win++;
				} else
					System.out.println("You Lose");
				lose++;

			}
			if (Dice[diceroll] % 2 != 0) {
				System.out.println("The Computer rolled an Odd Number");
				oddnumber++;
				if (playerguess.equals("odd")) {
					System.out.println("You Win");
					win++;
				} else
					System.out.println("You Lose");
				lose++;

			}
			System.out.printf("\nThis is Game is Number %d", numberofgames);
			System.out.printf("\nTotal Number of Odds: %d", oddnumber);
			System.out.printf("\nTotal Number of Even: %d", evennumber);
			System.out.printf("\nWin Percentage: %d", PercentWin);
			System.out.println("\nWould you like to play again? 1 for Yes, 2 for No");
			++numberofgames;
			cont = input.nextInt();
		}
		System.out.println(Array[counter]);
	}
}
// Good job
