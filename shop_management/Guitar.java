package shop_management;
import behaviours.*;

public class Guitar extends Instrument implements Playable {

  public Guitar(String material, String colour, int buyingPrice, int sellingPrice) {
    super(material, colour, buyingPrice, sellingPrice);
  }

  public String playInstrument() {
    return "strum strum";
  }

}