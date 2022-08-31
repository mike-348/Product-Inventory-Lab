package services;

import models.Whiskey;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class WhiskeyServiceTest {

    @Test
    public void testCreate() {
        WhiskeyService whiskeyService = new WhiskeyService();
        Whiskey whiskey = new Whiskey("Whiskey", "Jameson", "Jameson Whiskey",
                12.0, 12.0, 12);
        whiskeyService.create(whiskey);
        Assertions.assertEquals(1, whiskeyService.inventory.size());
    }

    @Test
    public void testFind() {
        WhiskeyService whiskeyService = new WhiskeyService();
        Whiskey whiskey = new Whiskey("Whiskey", "Jameson", "Jameson Whiskey",
                12.0, 12.0, 12);
        whiskeyService.create(whiskey);
        Assertions.assertEquals(whiskey, whiskeyService.find(1));
    }

    @Test
    public void testUpdate() {
        WhiskeyService whiskeyService = new WhiskeyService();
        Whiskey whiskey = new Whiskey("Whiskey", "Jameson", "Jameson Whiskey",
                12.0, 12.0, 12);
        whiskeyService.create(whiskey);

        Whiskey whiskey2 = new Whiskey("Jack Daniels", "Jack Daniels", "Jack Daniels Whiskey",
                12.0, 12.00, 12);
        whiskeyService.create(whiskey2);
        whiskeyService.update(whiskey2, 1);

        Assertions.assertEquals(1, whiskey.getId());
        Assertions.assertEquals("Jack Daniels", whiskeyService.find(1).getName());
        Assertions.assertEquals("Jack Daniels", whiskeyService.find(1).getBrand());
        Assertions.assertEquals("Jack Daniels Whiskey", whiskeyService.find(1).getDescription());
        Assertions.assertEquals(12.0, whiskeyService.find(1).getSize());
        Assertions.assertEquals(12.0, whiskeyService.find(1).getPrice());
        Assertions.assertEquals(12, whiskeyService.find(1).getQuantity());
    }

    @Test
    public void testDelete() {
        WhiskeyService whiskeyService = new WhiskeyService();
        Whiskey whiskey = new Whiskey("Whiskey", "Jameson", "Jameson Whiskey",
                12.0, 12.0, 12);
        whiskeyService.create(whiskey);
        whiskeyService.delete(1);
        Assertions.assertEquals(0, whiskeyService.inventory.size());
    }
}
