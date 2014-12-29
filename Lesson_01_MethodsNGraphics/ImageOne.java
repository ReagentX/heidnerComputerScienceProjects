//© A+ Computer Science
// www.apluscompsci.com

//graphics example for images

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.Canvas;
import javax.imageio.ImageIO;
import java.io.File;

public class ImageOne extends Canvas
{
	public ImageOne()
	{
		setBackground(Color.WHITE);
	}

	public void paint(Graphics window)
	{
		window.setColor(Color.RED);
		window.drawString("Drawing Images", 200, 200 );

		String imageName = new String("ACEofHEARTS.jpg");
		try
		{
			Image image = ImageIO.read(new File(imageName)); 
			window.drawImage(image,300,300,100,150,null);
		}
		catch(Exception e)
		{
			//feel free to do something here
		}		
	}
}