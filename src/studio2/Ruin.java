package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Insert start amount, win chance, and win limit");
		;		double startAmount = in.nextDouble();
		double winChance  = in.nextDouble();
		double winLimit  = in.nextDouble();
		
		int totalSims = in.nextInt();
		int simulationNum = 1;
		int totalLosses = 0;
		while (startAmount < winLimit && startAmount > 0) {
			double chance = Math.random();
			if (chance <= winChance)
			{ 
				startAmount = startAmount + 1;
				System.out.println("Simulation " + simulationNum + ": " + startAmount + " WIN");
				simulationNum = simulationNum + 1; 
			}
			else 
			{
				startAmount = startAmount - 1;
				System.out.println("Simulation " + simulationNum + ": " + startAmount + " LOSE");
				simulationNum = simulationNum + 1; 
				totalLosses = totalLosses + 1; 
			}
		}
		System.out.println("Loses: " + totalLosses + " Simulations: " + (simulationNum - 1));












	}

}
