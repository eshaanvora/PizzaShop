//Eshaan Vora
//EshaanVora@gmail.com

import java.text.DecimalFormat;

public class Pizza {
  private String m_size;
  private int m_numCheeseTop;
  private int m_numPepperoniTop;
  private int m_numVeggieTop;
  private double m_pizzaCost;

  //Create object to format numbers
  private static DecimalFormat df = new DecimalFormat("#");

  //Default constructors
  public Pizza(){
    m_size = "";
    m_numCheeseTop = 0;
    m_numPepperoniTop = 0;
    m_numVeggieTop = 0;
    m_pizzaCost = 0;
  }

  //Overloaded constructors
  public Pizza(String a, int b, int c, int d, double e){
    m_size = a;
    m_numCheeseTop = b;
    m_numPepperoniTop = c;
    m_numVeggieTop = d;
    m_pizzaCost = e;
  }

  //Accesser Methods
  public String getSize(){
    return m_size;
  }
  public int getNumCheeseTop(){
    return m_numCheeseTop;
  }
  public int getNumPepperoniTop(){
    return m_numPepperoniTop;
  }
  public int getNumVeggieTop(){
    return m_numVeggieTop;
  }
  public double getPizzaCost(){
    return m_pizzaCost;
  }

  //Mutator Methods
  public void setSize(String a){
    this.m_size = a;
  }
  public void setNumCheeseTop(int b){
    this.m_numCheeseTop = b;
  }
  public void setNumPepperoniTop(int c){
    this.m_numPepperoniTop = c;
  }
  public void setVeggieCheeseTop(int d){
    this.m_numVeggieTop = d;
  }
  public void setPizzaCost(double e){
    this.m_pizzaCost = e;
  }

  //Calculate and return the cost of the pizza
  public double calcCost(){
    if(m_size.equals("small")){
      m_pizzaCost = 10 + (2 * (getNumCheeseTop() + getNumPepperoniTop() + getNumVeggieTop()));
    }else if(m_size.equals("medium")){
      m_pizzaCost = 12 + (2 * (getNumCheeseTop() + getNumPepperoniTop() + getNumVeggieTop()));
    }else if(m_size.equals("large")){
      m_pizzaCost = 14 + (2 * (getNumCheeseTop() + getNumPepperoniTop() + getNumVeggieTop()));
    }

    return m_pizzaCost;
  }

  //Determine if Pizza objects are equal
	public boolean equals(Object o){
    if(!(o instanceof Pizza)){
      return false;
    } else{
      Pizza c = (Pizza)o;
      return (this.m_pizzaCost == c.m_pizzaCost) && (this.m_size == c.m_size);
    }
  }

  //toString should print the appropriate variables and be formatted
  public String toString(){
    String s = "";
    s += "Pizza Size: " + m_size;
    s += "\nQuantity of cheese toppings: " + m_numCheeseTop;
    s += "\nQuantity of pepperoni toppings: " + m_numPepperoniTop;
    s += "\nQuantity of veggie toppings: " + m_numVeggieTop;
    s += "\nTotal Cost: $" + df.format(m_pizzaCost) + "\n";
    return s;
  }

  /*public static void main(String[] args){
    Pizza pizza1 = new Pizza("large", 1, 1, 2, 0);
    pizza1.calcCost();
    System.out.print(pizza1.toString());
    }*/

}
