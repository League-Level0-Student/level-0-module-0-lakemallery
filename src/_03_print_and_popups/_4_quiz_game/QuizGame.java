package _03_print_and_popups._4_quiz_game;

import javax.swing.JOptionPane;

public class QuizGame {
	public static void main(String[] args) {
		
		// Create a variable to hold the user's score. Set it equal to zero. 
		int score =0;
		// ASK A QUESTION AND CHECK THE ANSWER
		
				// 2.  Ask the user a question 
		String input = JOptionPane.showInputDialog("What day of the week is it?");
				// 3.  Use an if statement to check if their answer is correct
		if (input.equalsIgnoreCase("friday")) {
			score += 1;
		} else {
			JOptionPane.showMessageDialog(null, "Incorrect!");
		
		}
		String input1 = JOptionPane.showInputDialog("What month is it?");
		
		if (input1.equalsIgnoreCase("july")) {
			score += 1;
		} else {
			JOptionPane.showMessageDialog(null, "Incorrect!");

		}
		String input2 = JOptionPane.showInputDialog("What year is it?");
		
		if (input2.equalsIgnoreCase("2020")) {
			score += 1;
		} else {
			JOptionPane.showMessageDialog(null, "Incorrect!");

		}
		String input3 = JOptionPane.showInputDialog("what color is grass?");
		
		if (input3.equalsIgnoreCase("green")) {
			score += 1;
		} else {
			JOptionPane.showMessageDialog(null, "Incorrect!");

		}
				// 4.  if the user's answer was correct, add one to their score 
		
		// MAKE MORE QUESTIONS. Ask more questions by repeating the above 
				// Option: Subtract a point from their score for a wrong answer
		
		
		// After all the questions have been asked, tell the user their final score 
		 JOptionPane.showMessageDialog(null, "Your score: " + score);
	}
}
