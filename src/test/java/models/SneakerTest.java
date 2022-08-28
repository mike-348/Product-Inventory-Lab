package models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SneakerTest {


    @Test
    public void testSneakerSettersGetters() {
        //given
        Sneaker sneaker = new Sneaker();
        String expectedName = "Nike Air Max";
        String expectedBrand = "Nike";
        String expectedColor = "White";
        String expectedSport = "Basketball";
        Double expectedSize = 10D;
        Double expectedPrice = 100D;
        Integer expectedQuantity = 10;


        //when
        sneaker.setName("Nike Air Max");
        sneaker.setBrand("Nike");
        sneaker.setColor("White");
        sneaker.setSport("Basketball");
        sneaker.setSize(10D);
        sneaker.setPrice(100.00);
        sneaker.setQuantity(10);
        String actualName = sneaker.getName();
        String actualBrand = sneaker.getBrand();
        String actualColor = sneaker.getColor();
        String actualSport = sneaker.getSport();
        Double actualSize = sneaker.getSize();
        Double actualPrice = sneaker.getPrice();
        Integer actualQuantity = sneaker.getQuantity();

        //then
        Assertions.assertEquals(expectedName, actualName);
        Assertions.assertEquals(expectedBrand, actualBrand);
        Assertions.assertEquals(expectedColor, actualColor);
        Assertions.assertEquals(expectedSport, actualSport);
        Assertions.assertEquals(expectedSize, actualSize);
        Assertions.assertEquals(expectedPrice, actualPrice);
        Assertions.assertEquals(expectedQuantity, actualQuantity);
    }
}
