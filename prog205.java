//card with vertical and horizontal gaps
import java.applet.Applet;
import java.awt.CardLayout;
import java.awt.Frame;
import java.awt.TextField;
public class prog205 extends Applet
{
	CardLayout c=new CardLayout(50,60);
	TextField f1=new TextField();
	TextField f2=new TextField();
	TextField f3=new TextField();
	public void init()
	{
		setLayout(c);
		add(f1);
		add(f2);
		add(f3);
	}
}

	