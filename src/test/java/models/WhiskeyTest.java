package models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class WhiskeyTest {

    @Test
    public void testWhiskeySettersGetters() {
        //given
        Whiskey whiskey = new Whiskey();
        String expectedBrand = "Jack Daniel's";
        String expectedDescription = "The finest whiskey in the world";
        Double expectedSize = 10D;
        Double expectedPrice = 100D;
        Integer expectedQuantity = 10;

        //when
        whiskey.setBrand("Johnnie Walker");
        whiskey.setDescription("The best whiskey in the world");
        whiskey.setSize(10D);
        whiskey.setPrice(100.00);
        whiskey.setQuantity(10);
        String actualBrand = whiskey.getBrand();
        String actualDescription = whiskey.getDescription();
        Double actualSize = whiskey.getSize();
        Double actualPrice = whiskey.getPrice();
        Integer actualQuantity = whiskey.getQuantity();

        //then
        Assertions.assertEquals(expectedBrand, actualBrand);
        Assertions.assertEquals(expectedDescription, actualDescription);
        Assertions.assertEquals(expectedSize, actualSize);
        Assertions.assertEquals(expectedPrice, actualPrice);
        Assertions.assertEquals(expectedQuantity, actualQuantity);
    }

    @Test
    public void testWhiskeyConstructor() {
        //given
        Integer expectedId = 6;
        String expectedBrand = "Jack Daniel's";
        String expectedDescription = "The finest whiskey in the world";
        Double expectedSize = 10D;
        Double expectedPrice = 100D;
        Integer expectedQuantity = 10;

        //when
        Whiskey whiskey = new Whiskey(expectedBrand,
                expectedDescription, expectedSize, expectedPrice, expectedQuantity);

        Integer actualId = whiskey.getId();
        String actualBrand = whiskey.getBrand();
        String actualDescription = whiskey.getDescription();
        Double actualSize = whiskey.getSize();
        Double actualPrice = whiskey.getPrice();
        Integer actualQuantity = whiskey.getQuantity();

        //then
        Assertions.assertEquals(expectedId, actualId);
        Assertions.assertEquals(expectedBrand, actualBrand);
        Assertions.assertEquals(expectedDescription, actualDescription);
        Assertions.assertEquals(expectedSize, actualSize);
        Assertions.assertEquals(expectedPrice, actualPrice);
        Assertions.assertEquals(expectedQuantity, actualQuantity);

    }
}
