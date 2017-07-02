package shop_management;
import behaviours.*;

public class Piano extends Instrument implements Playable, Sellable {

  public Piano(String material, String colour, int buyingPrice, int sellingPrice) {
    super(material, colour, buyingPrice, sellingPrice);
  }

  public String playInstrument() {
    return "plinky plonky"; 
  }

  public int calculateMarkUp() {
    return sellingPrice - buyingPrice;
  }


}