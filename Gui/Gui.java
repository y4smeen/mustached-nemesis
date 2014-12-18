import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Gui extends JFrame implements ActionListener {

    private JButton b1,b2,labeler;
    private Container pane;
    private JLabel label;
    private JTextArea text;
    private JPanel canvas;
    private JCheckBox box;

    private int x = 10;
    private int y = 10;

    private class Canvas extends JPanel {
	public void PaintComponent(Graphics g) {
	    super.paintComponent(g);
	    g.setColor(Color.red);
	    g.fillOval(x,y,30,30);
	}
    }

    public void actionPerformed(ActionEvent e) {
	if (e.getSource() == b1) {
	    System.out.println("You clicked click");
	    System.out.println("And the text area has: " + text.getText());
	} else if (e.getSource() == labeler) {
	    label.setText(text.getText());
	    // pane.add(new JLabel(text.getText()));
	    text.setText(" ");
	} else if (e.getSource() == b2) {
	    System.out.println("Shutting down");
	    System.exit(0);
	}
    }

    private class Key implements KeyListener {
	public void keyPressed(KeyEvent e) {
	    // System.out.println(e);
	    // System.out.println();
	}
	public void keyReleased(KeyEvent e) {
	}
	public void keyTyped(KeyEvent e) {
	    if (box.isSelected()) {
		String s = text.getText();
		s = s.toUpperCase();
		text.setText(s);
	    }
	}
    }


    public Gui() {

	setTitle("gui??");
	setSize(600,400);
	setLocation(100,100);
	setDefaultCloseOperation(EXIT_ON_CLOSE);

	pane = getContentPane();
	pane.setLayout(new FlowLayout());
	label = new JLabel("The Label:");
	pane.add(label);

	b1 = new JButton("click me");
	pane.add(b1);
	b2 = new JButton("exit");
	pane.add(b2);

	text = new JTextArea();
	text.setColumns(40);
	text.setRows(10);
	text.setBorder(BorderFactory.createLineBorder(Color.red, 2));
	pane.add(text);

	canvas = new JPanel();
	canvas.setPreferredSize(new Dimension(300,300));
	canvas.setBorder(BorderFactory.createLineBorder(Color.blue, 2));
	text.addKeyListener(new Key());
	pane.add(canvas);

    }
    public static void main(String[] args) {
	Gui f = new Gui();
	f.setVisible(true);
    }
}
