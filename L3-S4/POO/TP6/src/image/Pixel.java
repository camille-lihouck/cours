package image;
import image.color.GrayColor;

/**
 */

public class Pixel{
    //attributs
    private GrayColor color;

    //constructeur
    public Pixel(int level){
	this.color= new GrayColor(level);
    }

    //méthodes
    public void setColor(int level){
	this.color= new GrayColor(level);
    }

    public GrayColor getColor(){
	return this.color;
    }

    public boolean equals(Object o){
	if (o instanceof Pixel){
	    return this.color.equals(((Pixel) o).getColor());
	}
	return false;
    }

    public 
