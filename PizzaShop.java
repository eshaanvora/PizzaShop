//Eshaan Vora
//EshaanVora@gmail.com

//Driver Class
public class PizzaShop{

  public static void main(String[] args) {
    //Create new pizza objects
    Pizza pizza1 = new Pizza("small", 1, 0, 1, 0); // Code to create a small pizza, 1 cheese, 1 veggie
    Pizza pizza2 = new Pizza("medium", 2, 2, 0, 0); // Code to create a medium pizza, 2 cheese, 2 pepperoni
    Pizza pizza3 = new Pizza("large", 2, 0, 0, 0);// Code to create a large pizza, 2 cheese
    PizzaOrder order = new PizzaOrder(2);// Code to create an order of TWO pizzas

    //Add pizzas to order
    order.addPizza(pizza1); // add pizza1 to the order
    order.addPizza(pizza2); // add pizza2 to the order
    order.addPizza(pizza3); // add pizza3 to the order – what happens here?
    System.out.println(order); // Should call order’s toString method

    //We can easily add functionality to recive pizza order from user input
  }
}
