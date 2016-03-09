package hanoi.util;
import hanoi.util.Disc;
import java.util.*;

/**
 *A tower is a support on wich you can put disc
 *
 *
 */

public class Tower {
    
    // attributs
    private ArrayList<Disc> content;
    private int top;
        
    //constructeur
    public Tower(){
	this.content = new ArrayList<Disc>();
    }
       
    //methodes
    /** Returns if a tower is empty
     *
     *@returns true if it's empty, false otherwise*/
    public boolean isEmpty(){
	return this.content.size()==0;
    }

    /** Put a disc on the top of the tower
     *
     *@param the disc to put on the top of the tower*/
    public void putOn(Disc disc){
	this.content.add(disc);
    }

    /** Remove a disc from the top of the tower
     *
     *@return the disc that has been removed*/
    public Disc takeOff(){
	return this.content.remove(this.content.size()-1);
    }
}
