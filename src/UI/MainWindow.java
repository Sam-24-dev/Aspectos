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

	        JButton blackBtn = new JButton("Negro");
			blackBtn.addActionListener(e -> {
				subject.setColor(java.awt.Color.BLACK);
				subject.notifyAllObservers();
			});
			
			JButton yellowBtn = new JButton("Naranja");
			yellowBtn.addActionListener(e -> {
				subject.setColor(java.awt.Color.ORANGE);
				subject.notifyAllObservers();
			});
			
			JButton orangeBtn = new JButton("Amarillo");
			orangeBtn.addActionListener(e -> {
				subject.setColor(java.awt.Color.YELLOW);
				subject.notifyAllObservers();
			});


	        add(blackBtn);
	        add(yellowBtn);
	        add(orangeBtn);

			System.out.println("Ventana iniciada. Listo para cambiar colores y escoga el que este disponible.");

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

