import javax.swing.JOptionPane;

public class Echo
{
	public static void main(String[] args)
	{
		String Echo = JOptionPane.showInputDialog("Say something.");
		echo(Echo);
	}

	public static void echo(String word)
	{
		JOptionPane.showMessageDialog(null, word + " " + word);
	}
}
