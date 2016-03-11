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
    private int capacity;
    private Disc[] content;
    private int top;
        
    //constructeur
    public Tower(int capacity){
	this.content = new Disc[capacity];
	this.capacity = capacity;
	this.top=0;
    }
       
    //methodes
    /** Returns if a tower is empty
     *
     *@return true if it's empty, false otherwise*/
    public boolean isEmpty(){
	return this.top==0;
    }

    /** Put a disc on the top of the tower, the disc must me smaller than the disc wich are already on the tower
     *
     *@param disc the disc to put on the top of the tower
     *@return true if the disc has been added to the tower false otherwise
     */
    public boolean putOn(Disc disc){
	if( this.isEmpty() ||( this.content[this.top].getSize() < disc.getSize() && this.top<this.capacity-1 )){
	    this.content[this.top+1]=disc;
	    this.top+=1;
	    return true;
	}
	return false;
    }

    /** Remove a disc from the top of the tower
     *
     *@return the disc that has been removed*/
    public Disc takeOff(){
	if (! this.isEmpty()){
	    this.top-=1;
	    Disc removed= this.content[top+1];
	    this.content[top+1]=null;
	    return removed;
	}
	return null;
    }
}
