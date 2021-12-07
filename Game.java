import java.applet.Applet;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.*;


import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import org.w3c.dom.css.Rect;
public class Game extends Applet implements KeyListener
{

	public static int playerA = 0;
	
	public Rectangle rect = new Rectangle(-680, -1000, 1360,1700);public static int playerB = 0;
	public void init()
	{
		this.addKeyListener(this);
		
		this.setFocusable(true);
		this.requestFocusInWindow();
		
	}
	public void paint(Graphics g)
	{
		
		setSize(1360,700);
		
		setBackground(java.awt.Color.BLUE);
		Graphics2D g2 = (Graphics2D)g;
		g2.setColor(Color.RED);
		
		g2.fill(rect);
		if(playerA == 5)
		{
			
			g2.setColor(Color.WHITE);
			g.setFont(new Font("TimesRoman", Font.PLAIN, 300));
			g.drawString("Blue Wins", 70, 360);
			
		}
		if(playerB == 5)
		{
			g2.setColor(Color.WHITE);
			g.setFont(new Font("TimesRoman", Font.PLAIN, 300));
			g.drawString("Red Wins", 100, 360);
			
		}
		
		
		
	}
private void setFont(int i) {
		// TODO Auto-generated method stub
		
	}
@Override
	public void keyPressed(KeyEvent e) {
	
	
	
	if (e.getKeyCode() == KeyEvent.VK_K && playerA != 5 && playerB != 5)
		{
				
			playerA++;
			playerB--;
			rect.setLocation(rect.x -136 , rect.y );
			
			
		}
		else if (e.getKeyCode() == KeyEvent.VK_A && playerA != 5 && playerB != 5)
		{
			
			playerA--;
			playerB++;
			rect.setLocation(rect.x + 136, rect.y);
			
			
		}
	
	
			repaint();
		
	}
	
	

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}
		
	
	
	

