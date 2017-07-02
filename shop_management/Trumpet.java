package shop_management;
import behaviours.*;

public class Trumpet extends Instrument implements Playable {

  public Trumpet(String material, String colour, int buyingPrice, int sellingPrice) {
    super(material, colour, buyingPrice, sellingPrice);
  }

  public String playInstrument() {
    return "burrup burrup";
  }

}