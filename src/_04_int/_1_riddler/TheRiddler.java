package _04_int._1_riddler;
//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

import javax.swing.JOptionPane;

public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
			int score = 0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
			String RiddleOne = JOptionPane.showInputDialog (null, "What travels around the world, but stays in a corner?");
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
			if (RiddleOne.equalsIgnoreCase("A stamp")) {
				score ++;
			}
			
		// 5. Otherwise, say "wrong" and tell them the answer
			else {
				JOptionPane.showMessageDialog(null, "wrong, the answer is a stamp");
			}
		// 6. Add some more riddles
			String RiddleTwo = JOptionPane.showInputDialog(null, "What has many keys but cannot open any locks?");	
			if (RiddleTwo.equalsIgnoreCase("A piano")) {
				score ++;
			}
			else {
				JOptionPane.showMessageDialog(null, "Wrong, the correct answer is a piano");
			}
			String RiddleThree = JOptionPane.showInputDialog(null, "What runs all the way around the backyard but never moves");
			if (RiddleThree.equalsIgnoreCase("A fence")) {
				score ++;
			
			}
			else {
				JOptionPane.showMessageDialog (null, "Wrong, the answer is a fence");
			}
			String RiddleFour = JOptionPane.showInputDialog (null, "Which month do people sleep the least");
			if (RiddleFour.equalsIgnoreCase ("February")) {
				score ++;
			}
			else {
				JOptionPane.showMessageDialog (null, "Wrong, the correct answer is February because it has the least number of days");
			}
			// 2. Make a pop up to show the score.
			JOptionPane.showMessageDialog (null, "Your score is " + score);
	}
}

