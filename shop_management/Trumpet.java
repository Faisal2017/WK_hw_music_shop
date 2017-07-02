package shop_management;
import behaviours.*;

public class Trumpet extends Instrument implements Playable, Sellable {

  public Trumpet(String material, String colour, int buyingPrice, int sellingPrice) {
    super(material, colour, buyingPrice, sellingPrice);
  }

  public String playInstrument() {
    return "burrup burrup";
  }

  public int calculateMarkUp(int buyingPrice, int sellingPrice) {
    return (sellingPrice / buyingPrice ) - 1 * 100;
  }

}