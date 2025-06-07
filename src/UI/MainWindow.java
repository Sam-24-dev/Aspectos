package UI;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import observer.Observer;
import subject.Color;

public class MainWindow extends JFrame implements Observer {
	 private Color subject;

	    public MainWindow(Color subj) {
	        super("Demo Observer con AspectJ");
	        this.subject = subj;
	        subject.register(this);

	        setDefaultCloseOperation(EXIT_ON_CLOSE);
	        setSize(400, 200);
	        setLayout(new FlowLayout());

	        JButton redBtn = new JButton("Rojo");
	        redBtn.addActionListener(e -> subject.setColor(java.awt.Color.RED));
			subject.notifyAllObservers(); 

	        JButton greenBtn = new JButton("Verde");
	        greenBtn.addActionListener(e -> subject.setColor(java.awt.Color.GREEN));
			subject.notifyAllObservers();

	        JButton blueBtn = new JButton("Azul");
	        blueBtn.addActionListener(e -> subject.setColor(java.awt.Color.BLUE));
			subject.notifyAllObservers();

	        add(redBtn);
	        add(greenBtn);
	        add(blueBtn);

	        setVisible(true);
	    }

	    @Override
	    public void update(java.awt.Color newColor) {
	        getContentPane().setBackground(newColor);
	    }

	    public static void main(String[] args) {
	        new MainWindow(new Color());
	    }
	
	
	
}

