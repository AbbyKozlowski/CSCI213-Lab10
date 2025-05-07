/**
 * Car.java 
 * Extends the Vehicle class and contains different methods that creates a 
 * a car. This is a part of lab 10.
 * 5/7/25
 * @author Abby Kozlowski
 */
 
 public class Car extends Vehicle{
 	 
 	 //instance var for the number of doors
 	 private int doors;
 	 
 	 //instance var for number of passengers
 	 private int passengers;
 	 
 	 //This is an extra method made for testing.
 	 /**
 	  * A main method created for testing the methods.
 	  * @param args Command line arguments (String[])
 	  */
 	 public static void main(String[] args){
 	 	 Car car1= new Car("Honda", "CRV", "Binary", 4, 4);
 	 	  System.out.println(car1);
 	 }
 	 
 	
 	 /**
 	  * Constructor that receives the make, model, plate, doors, and passengers 
 	  * and sets them appropriately.
 	  *@param aMake the make of the Car (String)
 	  *@param aModel the model of the Car (String)
 	  *@param aPlate the plate of the Car (String)
 	  *@param theDoors the door number of the Car (int)
 	  *@param thePassengers the number of passengers within the Car (int)
 	  */
 	 public Car(String aMake, String aModel, String aPlate, int theDoors, int thePassengers){
 	 	 super(aMake, aModel, aPlate);
 	 	 
 	 	 this.doors= theDoors;
 	 	 this.passengers= thePassengers;
 	 	 
 	 }
 	 
 	 /**
 	  * A getter to get the number of doors within the Car.
 	  * @return the number of doors within the Car.
 	  */
 	  public int getDoors(){
 	  	  return this.doors;
 	  }
 	 
 	  
 	 /**
 	  * A getter to get the number of passengers within the Car.
 	  * @return the number of passengers within the Car.
 	  */
 	  public int getPassengers(){
 	  	  return this.passengers;
 	  	  
 	  }
 	  
 	  @Override 
 	  /**
 	   * toString method that returns a string of the form:
 	   * [#]-door [make] [model] with license [plate].
 	   * @return A String of Car information (String)
 	   */
 	   public String toString(){
 	   	   String carInfo= "";
 	   	   carInfo= String.format("%d-door %s %s with license %s.", this.doors, 
 	   	   	   this.getMake(), this.getModel(), this.getPlate());
 	   	   return carInfo;
 	   	   
 	   }
 	   
 	   

 	   @Override
 	  /**
 	   * Overrides the equals method, Cars are eqivalent all inherited 
 	   * properties are equal.
 	   * @param obj another Cars object (Object)
 	   * @return if the two Cars are equal (boolean)
 	   */
		public boolean equals(Object obj){
				
				//must see if an instanceof Car
				if (!(obj instanceof Car)){
					return false;
				}
				
				//create another Car object
				Car other = (Car) obj;
				
				//compare the two Cars
				if(super.equals(other)) {
					if(this.doors == other.getDoors()) {
						if(this.passengers == other.getPassengers()){
								return true;
						}
					}
				}
				
				//if not equal, return false
				return false;
			}
			
			
			
			
		//@Override
		/**
		 * Creates a copy of the Car.
		 * @return a copy of a Car (Car)
		 */
		public Car copy(){
			Car car= new Car(this.getMake(), this.getModel(), this.getPlate(), 
				this.doors, this.passengers);
			return car;
		}

 }