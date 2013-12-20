package attempt;

import javax.swing.JOptionPane;

public class TryCatchRunner
{
	public static void main(String[] args)
	{
		int testNumber = 15;
		int otherNumber = 0;
		double testDouble = 136.2312;
		double otherDouble = 0.00;
		
		try
		{
			testNumber = testNumber/otherNumber;
			JOptionPane.showMessageDialog(null, "Here is the answer: " + testNumber);
		}
		catch(Exception currentError)
		{
			JOptionPane.showMessageDialog(null, "Here is the error: " + currentError.getMessage());
			JOptionPane.showMessageDialog(null, "Here is the error: " + currentError.toString());
		}
		
		try
		{
			testDouble = otherDouble/otherDouble;
			JOptionPane.showMessageDialog(null, "Here is the answer: " + testDouble);
		}
		catch(Exception currentError)
		{
			JOptionPane.showMessageDialog(null, "Here is the error: " + currentError.getMessage());
			JOptionPane.showMessageDialog(null, "Here is the error: " + currentError.toString());
		}
	}
}
