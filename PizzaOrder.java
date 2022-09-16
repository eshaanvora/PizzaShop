//Eshaan Vora
//EshaanVora@gmail.com

import java.text.DecimalFormat;

public class PizzaOrder{
  private Pizza[] m_order;
  private int m_numPizzas;

  //Create object to format numbers
  DecimalFormat df = new DecimalFormat("#");

  //Default constructors
  public PizzaOrder(){
    m_order = new Pizza[1];
    m_order[0] = new Pizza("Small", 1, 0, 0, 0);
    m_numPizzas = 1;
  }

  //Overloaded constructors
  public PizzaOrder(int numPizzas){
    m_order = new Pizza[numPizzas];
    this.m_numPizzas= 0;
  }

  //Add pizza objects to the order array
  public void addPizza(Pizza pizza){
    for(int p = 0; p < m_order.length; p++) {
       if(m_order[p] == null){
         m_order[p] = pizza;
         System.out.println("Pizza added!");
         m_numPizzas++;
         return;
       }
     }
    //Pizzas should not be added if the order array is full
    //Program should not crash
    System.out.println("Pizza could not be added.");
  }

  public double calcTotal() {
    double tp = 0.0;
    int i = 0;
    //Iterate through the pizza objects and add the pizza costs to calculate the total cost
    while (m_order.length > i) {
        tp += m_order[i++].calcCost();
    }
    return tp;
  }

  public String toString() {
      return "Total Pizzas Ordered: " + m_numPizzas + "\nTotal Price: $" + df.format(calcTotal());
  }
}
