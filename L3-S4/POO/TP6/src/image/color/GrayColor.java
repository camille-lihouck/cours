package image.color;

/**

 */

public class GrayColor{
    //attributs
    public static final GrayColor WHITE = new GrayColor(255);
    public static final GrayColor BLACK = new GrayColor(0);
    private int level;

    //constructeurs
    public GrayColor(int level){
	this.level = level;
    }

    //méthodes
    public int getLevel(){
	return this.level;
    }

    public boolean equals(Object o){
	if (o instanceof GrayColor){
	    return ((GrayColor) o).getLevel()==this.level;
	}
	return false;
    }
}
