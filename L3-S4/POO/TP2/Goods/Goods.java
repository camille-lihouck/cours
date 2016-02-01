
/**
 * Goods is carracterize by a name and a value
 * 
 * @author Camille Lihouck 
 * @version 1.0
 */
public class Goods
{
   //attributs
   /** defines the name of a goods */
   private String name;
   /** defines the value of a goods */
   private double value;
   
   //constructeurs
   /** build a goods carracterized by its name, the value its initialized at 0
    * @param name(String) the name of the goods
    */
   public Goods( String name){
       this.name=name;
       this.value=0;
    }
    /** build a goods carracterized by its name and an initialized value
    * @param name (String) the name of the goods
    * @param value (double) the value of the goods
    */
   public Goods(String name, double value){
       this.name=name;
       this.value=value;
    }
    
    //methodes
    /** get the value of a goods
     * @return the value of a goods (double)
     */
    public double getValue(){
       return this.value;
    }
    /** change the value of a goods
     * @param value (double) the new value of a goods
     */
    public void changeValue( double value){
        this.value=value;
    }
    /** get the name of a goods
     * @return the name of a goods (String)
     */
    public String getName(){
        return this.name;
    }
    /** provides a string representation of a goods  with its name and its value
     * @return a string representation of a goods
     */
    public String toString(){
        return "the goods "+ this.name + " cost " + this.value;
    }
    /** gives the value TTC of a goods
     * @return the value TTC of a goods (double)
     */
    public double valueTTC(){
        return this.value*1.196;
    }
}
