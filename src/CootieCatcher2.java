import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class CootieCatcher2 extends JFrame implements ActionListener {

	private static int size = 600;
	private static final long serialVersionUID = 1L;
	private boolean hasBeenClicked = false;

	public static void main(String args[]) {
		new CootieCatcher2().setVisible(true);

	}

	private CootieCatcher2() {
		super("Cootie Catcher 2");
		setSize(size, size);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new GridLayout(2, 2));

		JButton one = new JButton("ONE");
		JButton two = new JButton("TWO");
		JButton three = new JButton("THREE");
		JButton four = new JButton("FOUR");
		add(one);
		add(two);
		add(three);
		add(four);
		one.addActionListener(this);
		two.addActionListener(this);
		three.addActionListener(this);
		four.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		String name = e.getActionCommand();
		if (name.equals("ONE")) {
			if (!hasBeenClicked) {
				System.out.println("Choose between 5,6,7 or 8");
				hasBeenClicked = true;
			} else {
				System.out.println("Einstein's Bagel Co burned your bagel :')");
			}
		} else if (name.equals("TWO")) {
			if (!hasBeenClicked) {
				System.out.println("Choose between 5,6,7 or 8");
				hasBeenClicked = true;
			} else {
				System.out.println("You ran into Jeff Challen and he waved to you!! *fangirls*");
			}
		} else if (name.equals("THREE")) {
			if (!hasBeenClicked) {
				System.out.println("Choose between 5,6,7 or 8");
				hasBeenClicked = true;
			} else {
				System.out.println("Gradle has a glitch and randomly gives you an A on all the MP's you didn't finish!!");
			}
		} else if (name.equals("FOUR")) {
			if (!hasBeenClicked) {
				System.out.println("Choose between 5,6,7 or 8");
				hasBeenClicked = true;
			} else {
				System.out.println("Your post on the forum got a record amount of likes <3");
			}
		}
	}
}
