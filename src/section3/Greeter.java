package section3;

import javax.swing.JOptionPane;

public class Greeter {

	public static void main(String[] args) {
		
		String name = JOptionPane.showInputDialog(null, "dude whats ur name?");
		JOptionPane.showMessageDialog(null, "hello " + name);
		if(name.equals("chad")) {
			JOptionPane.showMessageDialog(null, "lol what type of a name is chad");
		}
		else {
			JOptionPane.showMessageDialog(null, "at least ur name isnt chad");
		}
	}
	
}
