import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;


public class CootieCatcher extends JFrame implements ActionListener {

	private static int size = 600;
	private static final long serialVersionUID = 1L;
	
	
	public static void main(String args[]){
		new CootieCatcher().setVisible(true);

	
		
	}	
	private CootieCatcher() {
		super("Cootie Catcher");
		setSize(size,size);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new GridLayout(2,2));

		JButton red = new JButton("RED");
		JButton blue = new JButton("BLUE");
		JButton green = new JButton("GREEN");
		JButton yellow = new JButton("YELLOW");
		add(red);
		add(blue);
		add(green);
		add(yellow);
		red.addActionListener(this);
		blue.addActionListener(this);
		green.addActionListener(this);
		yellow.addActionListener(this);

	
	
	}
	
	public void actionPerformed(ActionEvent e) {
		String name = e.getActionCommand();
		if(name.equals("RED")) {
			System.out.println("Choose between 1,2,3 or 4");
		}else if(name.equals("BLUE")) {
			System.out.println("Choose between 5,6,7 or 8");
		}else if(name.equals("GREEN")) {
			System.out.println("Choose between 1,2,3 or 4");
		}else if(name.equals("YELLOW")){
			System.out.println("Choose between 5,6,7 or 8");
		}
		
	}
}

