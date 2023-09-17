import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class ShopRepositoryTest {
    @Test
    public void testRemoveProductExist(){
        ShopRepository repo = new ShopRepository();
        Product product1 = new Product(9, "журнал", 500);
        Product product2 = new Product( 16, "айпад", 25_000);

        repo.add(product1);
        repo.add(product2);
        repo.remove(16);
        Product[] actual = repo.findAll();
        Product[] expected = {product1};

        Assertions.assertArrayEquals(expected, actual);
    }
    //@Test
   // public void testRemoveProductNotExist(){
      //  ShopRepository repo = new ShopRepository();
      //  Product product1 = new Product(9, "журнал", 500);
       // Product product2 = new Product( 16, "айпад", 25_000);

       // repo.add(product1);
       // repo.add(product2);
       // Assertions.assertThrows(NotFoundException.class
       // () -> repo.remove(77)
            );
    }

    }
