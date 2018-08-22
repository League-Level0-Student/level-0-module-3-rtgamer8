import javax.swing.JOptionPane;

public class AreYouHappy {
public static void main(String[] args) {
	
String one = JOptionPane.showInputDialog("Are you happy");
	
	if (one.equalsIgnoreCase("yes") ) {
		JOptionPane.showMessageDialog(null, "keep doing whatever you are doing");
		
	}
	
	else if (one.equalsIgnoreCase("no") ) {
		String two = JOptionPane.showInputDialog("Do you want to be happy");
		
		if (two.equalsIgnoreCase("no") ) {
			JOptionPane.showMessageDialog(null, "keep doing whatever you are doing");
		}
		else if (two.equalsIgnoreCase("yes") ) {
			JOptionPane.showMessageDialog(null, "Change something");
		}
		
	}
	
	
	
}
}
