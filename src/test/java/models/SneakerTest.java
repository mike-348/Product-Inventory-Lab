package models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
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
        sneaker.setName(expectedName);
        sneaker.setBrand(expectedBrand);
        sneaker.setColor(expectedColor);
        sneaker.setSport(expectedSport);
        sneaker.setSize(expectedSize);
        sneaker.setPrice(expectedPrice);
        sneaker.setQuantity(expectedQuantity);

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

    @Test
    public void testSneakerConstructor() {
        //given
        String expectedName = "Stan Smith";
        String expectedBrand = "Adidas";
        String expectedColor = "White";
        String expectedSport = "Tennis";
        Double expectedSize = 10D;
        Double expectedPrice = 100D;
        Integer expectedQuantity = 10;

        //when
        Sneaker sneaker = new Sneaker(expectedName, expectedBrand,
                expectedColor, expectedSport, expectedSize, expectedPrice, expectedQuantity);

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

    @Test
    public void toStringTest() {
        //given
        String expectedName = "Nike Air Max";
        String expectedBrand = "Nike";
        String expectedColor = "White";
        String expectedSport = "Basketball";
        Double expectedSize = 10D;
        Double expectedPrice = 100D;
        Integer expectedQuantity = 10;
        String expectedString = "Sneaker{id=null, name='Nike Air Max', brand='Nike', color='White', sport='Basketball', size=10.0, price=100.0, quantity=10}";
        Sneaker sneaker = new Sneaker(expectedName, expectedBrand, expectedColor, expectedSport, expectedSize, expectedPrice, expectedQuantity);

        //when
        String actual = sneaker.toString();
        //then
        Assertions.assertEquals(expectedString, actual);
    }

}
