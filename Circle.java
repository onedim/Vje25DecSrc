import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

/**
 * Klasa koja ce da iscrtava krug
 * @author nedimomerovic
 *
 */
public class Circle {
	
	private int x;
	private int y;
	private int radius;
	private boolean isFilled;
	private Color color;
	private int speedX;
	private int speedY;
	private Dimension winDimension;
	
	
	public Circle(int x, int y, int radius, boolean isFilled,Color color,int speedX,int speedY,Dimension winDimension) {//konstruktor
		this.x = x;
		this.y = y;
		this.radius = radius;
		this.isFilled = isFilled;
		this.color=color;
		this.speedX=speedX;
		this.speedY=speedY;
		this.winDimension=winDimension;
		
	}
	
	public void drawCircle(Graphics g){
		
		moveCircle();
		
		g.setColor(color);
		if (isFilled==true){
			g.fillOval(x, speedY, radius, radius);
		}else 
			g.drawOval(x, y, radius, radius);
		
		}
	public void moveCircle(){
		if (x<0 ||x>winDimension.getWidth()){
			speedX*=-1;
			}
		if (y<0 || y>winDimension.getHeight()){
			speedY*=-1;
		}
			
			
		
		
		
		x=x+speedX;
		y=y+speedY;
		
	}
	
	

}
