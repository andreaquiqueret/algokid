import java.awt.Point;
import java.awt.image.BufferedImage;

public class PointImage 
{
	private Point p;
	private BufferedImage img;
	
	public PointImage(Point p, BufferedImage img) 
	{
		super();
		this.p = p;
		this.img = img;
	}

	public Point getP() 
	{
		return p;
	}

	public void setP(Point p) 
	{
		this.p = p;
	}
	
	public int getX() 
	{
		return p.x;
	}
	
	public int getY() 
	{
		return p.y;
	}

	public BufferedImage getImg() 
	{
		return img;
	}

	public void setImg(BufferedImage img) 
	{
		this.img = img;
	}
}
