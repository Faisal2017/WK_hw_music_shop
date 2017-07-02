 import static org.junit.Assert.*;
 import org.junit.*;
 import shop_management.*;

 public class PianoTest {

  Piano piano;

  @Before
  public void before() {
    piano = new Piano("maple", "black and white", 300, 400);
  }
 
  @Test
  public void hasMaterial() {
    assertEquals("maple", piano.getMaterial());
  }

  @Test
  public void hasColour() {
    assertEquals("black and white", piano.getColour());
  }

  @Test
  public void hasBuyingPrice() {
    assertEquals(300, piano.getBuyingPrice());
  }

  @Test
  public void hasSellingPrice() {
    assertEquals(400, piano.getSellingPrice());
  }

  @Test
  public void canBePlayed() {
    assertEquals("plinky plonky", piano.playInstrument());
  }


 }