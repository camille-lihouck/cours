package hanoi;
import hanoi.util.*;

/**
 * Hanoi represents an hanoi game
 *
 */

public class Hanoi{

    //attributs

    private Tower[] towers;
    private int capacity;

    //constructeur

    public Hanoi(int capacity){
	this.capacity=capacity;
	this.towers= new Tower[3];
	for (int i=0; i<3;i++){
	    this.towers[i]= new Tower(capacity);
	}
	for (int i=capacity;i>0; i--){
	    this.towers[0].putOn(new Disc(i));
	}
    }

    //methodes
    /**
     * get the towers
     *
     *@return the list of towers*/
    public Tower[] getTowers(){
	return this.towers;
    }


    /**
     * move the top disc for the original tower to the destination one
     *
     *@param origin the original tower
     *@param dest the destination tower
     *@return true is the disc has been succesufly moved false otherwise*/
    public boolean moveOneDisc(int origin, int dest){
	if (! towers[origin].isEmpty()){
	    Disc disc= towers[origin].takeOff();
	    return towers[dest].putOn(disc);
	}
	return false;
    }

    /**
     *move the given number of disc from the original tower to the destination one using the intermediate one
     *
     *@param size the size of the tower to move
     *@param origin the original tower
     *@param inter the intermediate tower to use
     *@param dest the destination tower*/
    public void move(int size, int origin, int inter, int dest){
	if (size>0){
	    size-=1;
	    move(size,origin,dest,inter);
	    moveOneDisc(origin,dest);
	    move(size,inter,origin,dest);
	}
    }
    /**
     *solve the hanoi game
     */
    public void solve(){
	move(this.capacity,0,1,2);
    }
}
