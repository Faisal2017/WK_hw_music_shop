package shop_management;

public abstract class Instrument {

  String material;
  String colour;
  int buyingPrice;
  int sellingPrice;

  public Instrument(String material, String colour, int buyingPrice, int sellingPrice) {
    this.material = material;
    this.colour = colour;
    this.buyingPrice = buyingPrice;
    this.sellingPrice = sellingPrice;
  }

  public String getMaterial() {
    return this.material;
  }

  public String getColour() {
    return this.colour;
  }

  public int getBuyingPrice() {
    return this.buyingPrice;
  }

  public int getSellingPrice() {
    return this.sellingPrice;
  }
}