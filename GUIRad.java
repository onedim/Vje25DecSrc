import java.awt.Color;

import java.awt.Component;

import java.awt.Graphics;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

import javax.swing.JFrame;

import javax.swing.JPanel;

import javax.swing.Timer;

/**
 * 
 * 
 * 
 * @author mustafaademovic
 * 
 *
 */

public class Guigui extends JPanel implements ActionListener {

	int frame = 0;

	public static void main(String[] args) {

		JFrame window = new JFrame("Novi prozor");

		Guigui drawPanel = new Guigui();

		window.setContentPane(drawPanel);

		drawPanel.repaint();

		window.setSize(500, 500);

		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		window.setVisible(true);

		Timer t = new Timer(30, drawPanel);

		t.start();

	}// Kraj maina

	/**
	 * 
	 * Metoda paintComponent treba da u prozoru ispiše krug dimenzija 50 x 50 na
	 * 
	 * koordinatama x 50 i y 50 plave boje
	 */

	public void paintComponent(Graphics g) {

		super.paintComponent(g);

		g.setColor(Color.BLUE);// Određujemo boju

		g.fillOval(50 + frame, 50 + frame, 50, 50);// Određujemo dimenzije i
													// koordinate

		paintComponent2(g);

	}// Kraj metode paintComponent

	/**
	 * 
	 * Metoda paintComponent2 treba da u prozoru ispiše kvadrat dimenzija 50 x
	 * 
	 * 50 na koordinatama x 100 i y 100 crvene boje
	 * 
	 * 
	 * 
	 * @param a
	 */

	public void paintComponent2(Graphics a) {

		a.setColor(Color.RED);// Određujemo boju

		a.fillRect(250 - frame, 150 - frame, 50, 50);// Određujemo dimenzije i
														// koordinate

	}// Kraj metode paintComponent2

	@Override
	public void actionPerformed(ActionEvent e) {

		frame++;

		repaint();

	}// Kraj metode actionPerformed

}// Kraj klase Guigui