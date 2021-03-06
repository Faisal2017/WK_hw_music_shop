package shop_management;
import behaviours.*;
import java.util.ArrayList;

public class Shop {

  private String name;
  private ArrayList<Sellable> stock;

  public Shop(String name) {
    this.name = name;
    this.stock = new ArrayList<Sellable>();
  }

  public String getName() {
    return this.name;
  }

  public int stockCount() {
    return this.stock.size();
  }

  public void addToStock(Sellable stock) {
    this.stock.add(stock);
  }

  public void removeFromStock(Sellable stock) {
    this.stock.remove(stock);
  }  

}