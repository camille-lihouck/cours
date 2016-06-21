package image;
import image.color.GrayColor;

/**
A pixel is represent by a GrayColor

 */

public class Pixel{
    //attributs
    private GrayColor color;

    //constructeur
    public Pixel(int level){
	this.color= new GrayColor(level);
    }

    //méthodes
    /** Set the pixel color
     *@param level the graycolor level
     */
    public void setColor(int level){
	this.color= new GrayColor(level);
    }

    /** Return the color of the pixel
     *@return the graycolor of the pixel
     */
    public GrayColor getColor(){
	return this.color;
    }

    /** Return if the object is equal to the pixel
     *@return True is the objects are equals, false otherwise
     */
    public boolean equals(Object o){
	if (o instanceof Pixel){
	    return this.color.equals(((Pixel) o).getColor());
	}
	return false;
    }

    /** Return the color difference between the pixel in parameter and the pixel on witch this method is use
     *@param pixel the pixel to compare with
     *@return the diffence between the two colors of the pixels
     */
    public int colorDifference(Pixel pixel){
	return Math.abs(this.color.getLevel() - pixel.getColor().getLevel());
    }
}
