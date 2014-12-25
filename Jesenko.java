import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



/**
 * Klasa za iscrtavanje u glavnoj funkciji
 */
import javax.swing.JPanel;




public class Jesenko extends JPanel implements ActionListener {
	Dimension winDimension;
	Circle krug;
	Circle krug1;

	public Jesenko(Dimension winDimension){
	int frame = 0;
	Circle krug=new Circle(30, 20, 80, true,Color.BLACK , 50, 50,winDimension());
	Circle krug1=new Circle(10, 70, 50, false,Color.BLACK , 50, 50, this.winDimension());

	public void paintComponent (Graphics g){//ukljucuje
		
		
		super.paintComponent(g);//poziva komponentu paintComponent
		g.setColor(Color.GRAY);//moras pozvati boju iznad definisanja objekta
		g.fillOval(50, 50, 50, 50);//definisi objekat koji zalis
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		frame ++;
		repaint();
		
		
	}
	
	
	

}
