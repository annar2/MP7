import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class CootieCatcher3 extends JFrame implements ActionListener {

	private static int size = 600;
	private static final long serialVersionUID = 1L;
	private boolean hasBeenClicked = false;

	public static void main(String args[]) {
		new CootieCatcher3().setVisible(true);
	}

	private CootieCatcher3() {
		super("Cootie Catcher 3");
		setSize(size, size);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new GridLayout(2, 2));

		JButton five = new JButton("FIVE");
		JButton six = new JButton("SIX");
		JButton seven = new JButton("SEVEN");
		JButton eight = new JButton("EIGHT");
		add(five);
		add(six);
		add(seven);
		add(eight);
		five.addActionListener(this);
		six.addActionListener(this);
		seven.addActionListener(this);
		eight.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		String name = e.getActionCommand();
		if (name.equals("FIVE")) {
			if (!hasBeenClicked) {
				System.out.println("Choose between 1,2,3 or 4");
				hasBeenClicked = true;
			} else {
				System.out.println("Someone stole your unassigned assigned seat in lecture :(");
			}
		} else if (name.equals("SIX")) {
			if (!hasBeenClicked) {
				System.out.println("Choose between 1,2,3 or 4");
				hasBeenClicked = true;
			} else {
				System.out.println("Lawrence makes you volunteer for ANOTHER sorting algorithm demonstration :/");
			}
		} else if (name.equals("SEVEN")) {
			if (!hasBeenClicked) {
				System.out.println("Choose between 1,2,3 or 4");
				hasBeenClicked = true;
			} else {
				System.out.println("10% curve on all final grades - everyone magically gets an A in CS 125");
			}
		} else if (name.equals("EIGHT")) {
			if (!hasBeenClicked) {
				System.out.println("Choose between 1,2,3 or 4");
				hasBeenClicked = true;
			} else {
				System.out.println("Amod forgets to send around the attendance sheet and nobody gets points for today.");
			}
		}

	}
}
