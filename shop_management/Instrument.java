public abstract class Instrument {

  String type;
  String material;
  String colour;

  public Instrument(String type, String material, String colour) {
    this.type = type;
    this.material = material;
    this.color = colour;
  }

  public String getType() {
    return this.type;
  }

  public String getMaterial() {
    return this.material;
  }

  public String getColour() {
    return this.colour;
  }
}