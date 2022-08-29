package models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class WhiskeyTest {

    @Test
    public void testWhiskeySettersGetters() {
        //given
        Whiskey whiskey = new Whiskey();
        String expectedName = "Johnnie Walker";
        String expectedBrand = "Johnnie Walker";
        String expectedDescription = "The best whiskey in the world";
        Double expectedSize = 10D;
        Double expectedPrice = 100D;
        Integer expectedQuantity = 10;

        //when
        whiskey.setName("Johnnie Walker");
        whiskey.setBrand("Johnnie Walker");
        whiskey.setDescription("The best whiskey in the world");
        whiskey.setSize(10D);
        whiskey.setPrice(100.00);
        whiskey.setQuantity(10);
        String actualName = whiskey.getName();
        String actualBrand = whiskey.getBrand();
        String actualDescription = whiskey.getDescription();
        Double actualSize = whiskey.getSize();
        Double actualPrice = whiskey.getPrice();
        Integer actualQuantity = whiskey.getQuantity();

        //then
        Assertions.assertEquals(expectedName, actualName);
        Assertions.assertEquals(expectedBrand, actualBrand);
        Assertions.assertEquals(expectedDescription, actualDescription);
        Assertions.assertEquals(expectedSize, actualSize);
        Assertions.assertEquals(expectedPrice, actualPrice);
        Assertions.assertEquals(expectedQuantity, actualQuantity);
    }

    @Test
    public void testWhiskeyConstructor() {
        //given
        Long expectedId = 6L;
        String expectedName = "Whiskey";
        String expectedBrand = "Jameson";
        String expectedDescription = "Jameson Whiskey";
        Double expectedSize = 10D;
        Double expectedPrice = 100D;
        Integer expectedQuantity = 10;

        //when
        Whiskey whiskey = new Whiskey(expectedId, expectedName, expectedBrand,
                expectedDescription, expectedSize, expectedPrice, expectedQuantity);

        Long actualId = whiskey.getId();
        String actualName = whiskey.getName();
        String actualBrand = whiskey.getBrand();
        String actualDescription = whiskey.getDescription();
        Double actualSize = whiskey.getSize();
        Double actualPrice = whiskey.getPrice();
        Integer actualQuantity = whiskey.getQuantity();

        //then
        Assertions.assertEquals(expectedId, actualId);
        Assertions.assertEquals(expectedName, actualName);
        Assertions.assertEquals(expectedBrand, actualBrand);
        Assertions.assertEquals(expectedDescription, actualDescription);
        Assertions.assertEquals(expectedSize, actualSize);
        Assertions.assertEquals(expectedPrice, actualPrice);
        Assertions.assertEquals(expectedQuantity, actualQuantity);

    }
}
