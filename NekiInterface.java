import java.awt.Color;
import java.awt.Graphics;
import java.awt.Paint;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.RepaintManager;
import javax.swing.Timer;

	


public class NekiInterface extends JPanel implements ActionListener{//ukljucuje jframe 
	int frame=0;
	public static void main(String[] args) {
		
		JFrame okvir=new JFrame();
		okvir.setSize(500, 500);//definise vecicinu u pixelima
		
		okvir.setVisible(true);//postavlja vidljivost
		
		okvir.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//defaultno izlazenje iz prozora
		
		Jesenko panel=new Jesenko();//mora se napraviti panel prije inicijalizacije donjeg reda
		
		okvir.setContentPane(panel);//crtanje u okvir
		
		panel.repaint();//pogledaj sta je ovo tacno????
		
		Timer t= new Timer(50,panel);
		t.start();
		
		
		
		
		okvir.setVisible(true);//postavlja vidljivost
	}
	

	
	public void paintComponent (Graphics g){//ukljucuje
		super.paintComponent(g);//poziva komponentu paintComponent
		g.setColor(Color.BLUE);//moras pozvati boju iznad definisanja objekta
		g.fillOval(50+frame, 50+frame, 50, 50);//definisi objekat koji zalis
		g.setColor(Color.GREEN);
		myRect(g);//dodatna metoda za iscrtavanje objekta
		g.setColor(Color.RED);
		myRoundRect(g);
		
		
	}
	
	public void myRect(Graphics b) //dodatna metoda za iscrtavanje objekta
	{
	b.fillRect(100,20+frame, 100, 100);
	
	}
	
	public void myRoundRect(Graphics a){
		a.fillRoundRect(300, 100, 200, 100, 30, 100);
	}
	


@Override
public void actionPerformed(ActionEvent e) {
	frame++;
	repaint();
	
}
	

}
