package hanoi.util;

/**
 * A disc is caracterized by a size
 *
 */

public class Disc{

    // attributs
    private int size;

    //constructeur
    /** Create a new disc given is size
     *
     *@param size the size of the disc
     */
    public Disc(int size){
	this.size=size;
    }

    //methodes
    /** Give the size of the disc
     *
     *@return the size of the disc
     */
    public int getSize(){
	return this.size;
    }
}
