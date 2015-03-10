import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JPanel;


public class JuliaSetView extends JPanel implements Observer{

	private JuliaModel model;
	
	public JuliaSetView(JuliaModel model)
	{
		this.model=model;
	}
	public void paintComponent(Graphics g)
	{
		Graphics2D g2=(Graphics2D) g;
		int height=getHeight();
		int width=getWidth();
		g2.clearRect(0,0,width,height);
		int scale = Math.min(height, width);
		
		for(int x=0;x<scale;x++)
		{
			for(int y=0;y<scale;y++)
			{
				double xNew = ((double)x/scale * 4) -2;
				double yNew = ((double)y/scale * 4)-2;
				int grayScale=model.isInSet(xNew,yNew);
				double greyLevel = (255 * (double)grayScale/model.getIterations());
				System.out.println((grayScale));
				Color grey = new Color((int)(255-greyLevel),(int)(255-greyLevel),(int)(255-greyLevel));

				g2.setColor(grey);

				
					Rectangle p = new Rectangle(x, y, 1, 1);
					g2.fill(p);
					g2.draw(p);
			}
		}
		
	}
	public void update(Observable o, Object arg) 
	{
		repaint();
		
	}
}
