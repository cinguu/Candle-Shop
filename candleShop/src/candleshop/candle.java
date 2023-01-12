package candleshop;
/**
 * @author Cindy Nguyen
 * ITSC1212-101, Nguyen
 * @version 1
 * @since 2022-10-26
 * Project 3
 * The main idea behind this activity is to create a program that accepts multiple
 * inputs from a user and uses that information to control the operation of the program.
 */
public class candle {
    
  

  // FIELDS
  private String name ; // This object's "name", i.e., "Taper", "Pillar", "Tea Light", etc.
  private String type; // This object's Type: 1, 2, or 3
  private double cost; // This object's cost
  private int burnTime; // This object's burn time in minutes

  // CONSTRUCTOR
  public candle(String nam, String typ, double cst, int brn) {
    this.name = nam; // Set this Candle object's name field
    this.type = typ; // Set this Candle object's type field
    this.cost = cst; // Set this Candle object's cost field
    this.burnTime = brn; // Set this Candle object's burn time field
  }

  // GETTER FOR NAME
  public String getName() {
    return this.name; // Return the name of this type of Candle
  }

  // SETTER FOR NAME
  public void setName(String nam) {
    this.name = nam; // Set the name of the current Candle object
  }

  // GETTER FOR TYPE
  public String getType() {
    return this.type; // Return the type number of the current Candle object
  }

  // SETTER FOR TYPE
  public void setType(String typ) {
    this.type = typ; // Set the type of the current Candle object
  }

  // GETTER FOR COST
  public double getCost() {
    return this.cost; // Return the cost of the current Candle object
  }

  // SETTER FOR COST
  public void setCost(double amount) {
    this.cost = amount; // Set the cost of the current Candle object
  }

  // GETTER FOR BURN TIME
  public int getTime() {
    return this.burnTime; // Return the burn time of the current Candle object
  }

  // SETTER FOR BURN TIME
  public void setTime(int minutes) {
    this.burnTime = minutes; // Set the burn time of the current Candle object
  }

  // Returns a String object with all the data from the current Candle object
  public String toString() {
    return "Each " + this.name + ", a type " + this.type + " candle, costs $" + this.cost + " and burns for "
        + this.burnTime + " minutes.";
  }
  

}
