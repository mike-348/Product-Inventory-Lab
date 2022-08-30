package services;

import models.Sneaker;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SneakerServiceTest {

    @Test
    public void testSneakerServiceCreate() {
        //given
        String expectedName = "Nike Air Max";
        String expectedBrand = "Nike";
        String expectedColor = "White";
        String expectedSport = "Basketball";
        Double expectedSize = 10D;
        Double expectedPrice = 100D;
        Integer expectedQuantity = 10;

        //when
        Sneaker sneaker = new Sneaker(expectedName, expectedBrand, expectedColor, expectedSport,
                expectedSize, expectedPrice, expectedQuantity);

        SneakerService sneakerService = new SneakerService();
        sneakerService.create(sneaker);

        //then
        Assertions.assertEquals(expectedName, sneaker.getName());
        Assertions.assertEquals(expectedBrand, sneaker.getBrand());
        Assertions.assertEquals(expectedColor, sneaker.getColor());
        Assertions.assertEquals(expectedSport, sneaker.getSport());
        Assertions.assertEquals(expectedSize, sneaker.getSize());
        Assertions.assertEquals(expectedPrice, sneaker.getPrice());
        Assertions.assertEquals(expectedQuantity, sneaker.getQuantity());

    }

    @Test
    public void testSneakerServiceFind() {
        //given
        String expectedName = "Nike Air Max";
        String expectedBrand = "Nike";
        String expectedColor = "White";
        String expectedSport = "Basketball";
        Double expectedSize = 10D;
        Double expectedPrice = 100D;
        Integer expectedQuantity = 10;

        //when
        Sneaker sneaker = new Sneaker(expectedName, expectedBrand, expectedColor, expectedSport,
                expectedSize, expectedPrice, expectedQuantity);

        SneakerService sneakerService = new SneakerService();
        sneakerService.create(sneaker);

        Long id = sneaker.getId();

        //then
        Assertions.assertEquals(expectedName, sneakerService.find(id).getName());
        Assertions.assertEquals(expectedBrand, sneakerService.find(id).getBrand());
        Assertions.assertEquals(expectedColor, sneakerService.find(id).getColor());
        Assertions.assertEquals(expectedSport, sneakerService.find(id).getSport());
        Assertions.assertEquals(expectedSize, sneakerService.find(id).getSize());
        Assertions.assertEquals(expectedPrice, sneakerService.find(id).getPrice());
        Assertions.assertEquals(expectedQuantity, sneakerService.find(id).getQuantity());
    }

    @Test
    public void testSneakerServiceUpdate() {
        //given
        String expectedName = "Nike Air Max";
        String expectedBrand = "Nike";
        String expectedColor = "White";
        String expectedSport = "Basketball";
        Double expectedSize = 10D;
        Double expectedPrice = 100D;
        Integer expectedQuantity = 10;

        //when
        Sneaker sneaker = new Sneaker(expectedName, expectedBrand, expectedColor, expectedSport,
                expectedSize, expectedPrice, expectedQuantity);

        SneakerService sneakerService = new SneakerService();
        sneakerService.create(sneaker);

        Long id = sneaker.getId();

        String expectedName2 = "Nike Air Max";
        String expectedBrand2 = "Nike";
        String expectedColor2 = "White";
        String expectedSport2 = "Basketball";
        Double expectedSize2 = 10D;
        Double expectedPrice2 = 100D;
        Integer expectedQuantity2 = 10;

        //when
        Sneaker sneaker2 = new Sneaker(expectedName2, expectedBrand2, expectedColor2, expectedSport2,
                expectedSize2, expectedPrice2, expectedQuantity2);

        sneakerService.update(sneaker2, id);

        //then
        Assertions.assertEquals(expectedName2, sneakerService.find(id).getName());
        Assertions.assertEquals(expectedBrand2, sneakerService.find(id).getBrand());
        Assertions.assertEquals(expectedColor2, sneakerService.find(id).getColor());
        Assertions.assertEquals(expectedSport2, sneakerService.find(id).getSport());
        Assertions.assertEquals(expectedSize2, sneakerService.find(id).getSize());
        Assertions.assertEquals(expectedPrice2, sneakerService.find(id).getPrice());
        Assertions.assertEquals(expectedQuantity2, sneakerService.find(id).getQuantity());
    }

    @Test
    public void testSneakerServiceDelete() {
        //given
        String expectedName = "Nike Air Max";
        String expectedBrand = "Nike";
        String expectedColor = "White";
        String expectedSport = "Basketball";
        Double expectedSize = 10D;
        Double expectedPrice = 100D;
        Integer expectedQuantity = 10;

        //when
        Sneaker sneaker = new Sneaker(expectedName, expectedBrand, expectedColor, expectedSport, expectedSize, expectedPrice, expectedQuantity);

        SneakerService sneakerService = new SneakerService();
        sneakerService.create(sneaker);

        Long id = sneaker.getId();
        //then
        Assertions.assertEquals(expectedName, sneakerService.find(id).getName());
        Assertions.assertEquals(expectedBrand, sneakerService.find(id).getBrand());
        Assertions.assertEquals(expectedColor, sneakerService.find(id).getColor());
        Assertions.assertEquals(expectedSport, sneakerService.find(id).getSport());
        Assertions.assertEquals(expectedSize, sneakerService.find(id).getSize());
        Assertions.assertEquals(expectedPrice, sneakerService.find(id).getPrice());
        Assertions.assertEquals(expectedQuantity, sneakerService.find(id).getQuantity());
        //when
        sneakerService.delete(id);
        //then
        Assertions.assertNull(sneakerService.find(id));
    }
}
