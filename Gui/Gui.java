import javax.swing.*;
import java.awt.*;

public class Gui extends JFrame {

    private JButton b1,b2;
    private Container pane;
    private JLabel l;
    private JTextArea text;
    private JPanel canvas;

    public Gui() {

	setTitle("gui??");
	setSize(600,400);
	setLocation(100,100);
	setDefaultCloseOperation(EXIT_ON_CLOSE);

	pane = getContentPane();
	//pane.setLayout(new GridLayout(3,3));
	pane.setLayout(new FlowLayout());
	l = new JLabel("The Label:");
	pane.add(l);

	b1 = new JButton("click me");
	pane.add(b1);
	b2 = new JButton("exit");
	pane.add(b2);
	text = new JTextArea();
	text.setColumns(40);
	text.setRows(10);
	text.setBorder(BorderFactory.createLineBorder(Color.red, 2));
	pane.add(text);
	/*
	JPanel buttongrid = new JPanel();
	buttongrid.setLayout(new GridLayout(3,3));
	buttongrid.add(new JButton("button 0"));
	*/

	canvas = new JPanel();
	canvas.setPreferredSize(new Dimension(300,300));
	canvas.setBorder(BorderFactory.createLineBorder(Color.blue, 2));
	pane.add(canvas);

    }
    public static void main(String[] args) {
	Gui f = new Gui();
	f.setVisible(true);
    }
}
