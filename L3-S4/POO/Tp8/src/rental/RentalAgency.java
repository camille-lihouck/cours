package rental;

import java.util.*;

/** a rental vehicle agency, client can rent one vehicle at a time */
public class RentalAgency {
    // vehicles of this agency
    private List<Vehicle> theVehicles;

    // maps client and rented vehicle (at most one vehicle by client) 
    private Map<Client,Vehicle> rentedVehicles;

    public RentalAgency() {
    	this.theVehicles = new List<Vehicle> ;
	this.rentedVehicles = new Map<Client,Vehicle> ;
    }
    
    /** adds a vehicle to this agency 
    * @param v the added vehicle
    */
    public void addVehicle(Vehicle v) {
    	this.theVehicles.add(v);
    }

    /** provides the list of the vehicles that satisfy the criterion c 
    * @param c the selection criterion 
    * @return  the list of the vehicles that satisfy the criterion c
    */
    public List<Vehicle> select(Criterion c) {	
    	// TO DO 	
        return null;
    }    
    /** displays the vehicles that satisfy the criterion c 
    * @param c the selection criterion
    */
    public void displaySelection(Criterion c) {
    	// TO DO
    }

    /** client rents a vehicle 
    * @param client the renter
    * @param v the rented vehicle
    * @return the daily rental price
    * @exception NoSuchElementException   if v is not a vehicle of this agency  
    * @exception IllegalStateException if v is already rented or client rents already another vehicle
    */
    public float rentVehicle(Client client, Vehicle v) throws NoSuchElementException, IllegalStateException {
    	// 	TO DO
    	return -1;
    }
    
    /** returns <em>true</em> iff client c is renting a vehicle
    * @return <em>true</em> iff client c is renting a vehicle
    */
    public boolean hasRentedAVehicle(Client client){
    	// TO DO
        return false;
    }
    
    /** returns <em>true</em> iff vehicle v is rented
    * @return <em>true</em> iff vehicle v is rented    
    */
    public boolean isRented(Vehicle v){
    	// TO DO
        return false;
    }
    
    /** the client returns a rented vehicle. Nothing happens if client didn't have rented a vehicle. 
    * @param the client who returns a vehicle
    */
    public void returnVehicle(Client client){
    	// TO DO 
    }
    /** provides the collection of rented vehicles for this agency
    * @return collection of currently rented vehicles 
    */
    public Collection<Vehicle> allRentedVehicles(){
    	// TO DO
        return null;
    }

}
