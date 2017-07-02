import static org.junit.Assert.*;
import org.junit.*;
import shop_management.*;

public class ShopTest {

  Shop shop;
  Guitar guitar;
  Trumpet trumpet;
  Piano piano;

  @Before
  public void before() {
    guitar = new Guitar("mahogany", "brown", 50, 75);
    piano = new Piano("maple", "black and white", 300, 400);
    trumpet = new Trumpet("brass", "gold", 65, 90);
    shop = new Shop("Music Store");
  }

  @Test
  public void hasName() {
    assertEquals("Music Store", shop.getName());
  }

  @Test
  public void testNoStockAtStart() {
    assertEquals(0, shop.stockCount());
  }

  @Test
  public void testCanAddStock() {
    shop.addToStock(guitar);
    assertEquals(1, shop.stockCount());
  }

  @Test
  public void testCanRemoveStock() {
    shop.addToStock(trumpet);
    shop.addToStock(piano);
    shop.removeFromStock(trumpet);
    assertEquals(1, shop.stockCount());
  }


}