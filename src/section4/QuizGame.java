package section4;

import javax.swing.JOptionPane;

public class QuizGame {
	
	public static void main(String[] args) {
		
		// 1.  Create a variable to hold the user's score 
		int score = 0;
		
		// 2.  Ask the user a question 
		String color = JOptionPane.showInputDialog("what color am i thinking of?");
		// 3.  Use an if statement to check if their answer is correct
		if(color.equals("black")) {
			JOptionPane.showMessageDialog(null, "ok");
			score+= 10;
		}
		else {
			JOptionPane.showMessageDialog(null, "wrong lol");
			score-= 10;
		}
		// 4.  if the user's answer was correct, add one to their score 
		
		// 5.  Create more questions by repeating steps 1, 2, and 3 below. 
		
		// 6.  After all the questions have been asked, print the user's score 
		JOptionPane.showMessageDialog(null, "your score is " + score);
	}
}
