import static org.junit.Assert.*;
import org.junit.*;
import shop_management.*;

public class TrumpetTest {

  Trumpet trumpet;

  @Before
  public void before() {
    trumpet = new Trumpet("brass", "gold", 65, 90);
  }

  @Test
  public void hasMaterial() {
    assertEquals("brass", trumpet.getMaterial());
  }

  @Test 
  public void hasColour() {
    assertEquals("gold", trumpet.getColour());
  }

  @Test
  public void hasBuyingPrice() {
    assertEquals(65, trumpet.getBuyingPrice());
  }

  @Test
  public void hasSellingPrice() {
    assertEquals(90, trumpet.getSellingPrice());
  }

  @Test
  public void canBePlayed() {
    assertEquals("burrup burrup", trumpet.playInstrument());
  }


}