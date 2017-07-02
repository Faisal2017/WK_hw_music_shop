import static org.junit.Assert.*;
import org.junit.*;
import shop_management.*;

public class GuitarTest {

  Guitar guitar;

  @Before 
  public void before() {
    guitar = new Guitar("mahogany", "brown", 50, 75);
  }

  @Test
  public void hasMaterial() {
    assertEquals("mahogany", guitar.getMaterial());
  }

  @Test 
  public void hasColour() {
    assertEquals("brown", guitar.getColour());
  }

  @Test
  public void hasBuyingPrice() {
    assertEquals(50, guitar.getBuyingPrice());
  }

  @Test
  public void hasSellingPrice() {
    assertEquals(75, guitar.getSellingPrice());
  }

  @Test
  public void canBePlayed() {
    assertEquals("strum strum", guitar.playInstrument());
  }


}