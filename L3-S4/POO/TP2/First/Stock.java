
/**
 * A stock is a quantity of elements
 * 
 * @author Camille Lihouck
 * @version 1.0
 */
public class Stock
{
   // constructeur
   
   /** build a stock initialized empty
    */
   public Stock(){
       this.quantity=0;
    }
   /** build a stock initialized with the given number
    * @param num (int) the number to initialize the stock with
    */
   public Stock(int num){
       this.quantity=num;
    }
    
    // attribut quantite
    /** defines the quantity of elements in the Stock  */
   private int quantity;
   
   //methode consultation du stock
   /** get the quantity of elements in the Stock
    * @return quantity of elements in the Stock (int) 
    */
   public int getQuantity(){
       return this.quantity;
    }
   
    //methode permettant d'ajouter du contenu au stock
   /** add elements to the Stock
    * @param num (int) the number of element to add to the Stock
    * side effect quantity is modified
    */
   public void add(int num){
       this.quantity= this.quantity + num;
    }
    
    //methode permettant de retirer du contenu au stock
    /** remove elements from the Stock (as long as there is element in the stock)
     * @param num (int) the number of element to remove from the Stock
     * @return the effective number of removed elements (int)
     */
    public int remove(int num){
        int removed=0;
        if (this.quantity<num){
           removed= this.quantity;
           this.quantity=0;
        }
        else{
           this.quantity -=num;
           removed=num;
        }
        return removed;
    }
    
    //methode permettant d'afficher le contenu du Stock
    /** provides a String representation of the Stock content
     * @ return a string representation of the Stock
     */
    public String toString(){
        return "the stock's quantity is " + this.quantity;
    }
}