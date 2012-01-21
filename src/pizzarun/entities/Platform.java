package pizzarun.entities;

import net.phys2d.raw.StaticBody;
import net.phys2d.math.Vector2f;
import net.phys2d.raw.shapes.Shape;
import net.phys2d.raw.shapes.Box;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;


public class Platform extends StaticBody
{

	/*public Platform(String name, Image image, Vector2f position, Shape collisionShape, int collisionType)
	{
		super(name, image, position, collisionShape, collisionType);
		// TODO Auto-generated constructor stub
	}*/
	
	// there's gotta be a way to condense all these constructors...	
	public Platform(Shape shape,float x, float y,Image img)
	{
		super(shape);
		this.setPosition(x,y);
		this.img=img;
		this.setFriction(200f);
	}
	public Platform(Shape shape,Vector2f pos,Image img)
	{
		this(shape,pos.x,pos.y,img);
	}
	public Platform(String name,Shape shape,float x,float y,Image img)
	{
		super(name,shape);
		this.setPosition(x,y);
		this.img=img;
		this.setFriction(200f);
	}
	public Platform(String name,Shape shape,Vector2f pos,Image img)
	{
		this(name,shape,pos.x,pos.y,img);
	}
	public Platform(float x, float y, Image img)
	{
		this( new Box((float)img.getWidth(),(float)img.getHeight()) , x , y , img );
		//System.out.println("Platform width: " + img.getWidth() + "\nPlatform height: " + img.getHeight());
	}
	public Platform(Vector2f pos, Image img)
	{
		this( pos.x , pos.y , img );
	}

	public void render(GameContainer gc,Graphics g)
	{
		img.draw(this.getPosition().getX(),this.getPosition().getY());
	}
	
	private Image img;
}
