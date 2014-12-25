import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Timer;


public class TimetTest {
	
	public static void main(String[] args) {
	
		Timer t=new Timer(500,new TimerHandler());
		t.start();
		Timer t2=new Timer(1000,new otherTimerHandler());
		t2.start();
		
		
	}
	private static class TimerHandler implements ActionListener{//ActionListener je event handler

		int counter=0;
		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println(counter++);
			
		}
		
	}
	private static class otherTimerHandler implements ActionListener{

		
		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("Djes Ba");
			
		}
		
	}
	
}
