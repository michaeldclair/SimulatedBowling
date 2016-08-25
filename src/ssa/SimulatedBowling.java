package ssa;

public class SimulatedBowling {

	public static long seed = (new java.util.Date()).getTime();
	public static java.util.Random rnd = new java.util.Random(seed);
	
	
	
	int random = rnd.nextInt(6) + 1;
	
	int bowlingScores[][] = new int[3][10];
	
}
