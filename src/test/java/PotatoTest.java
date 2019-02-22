import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class PotatoTest {

    @Test
    public void printPotatoDetails() {

        ArrayList<String> expectedPotato = new ArrayList<>(Arrays.asList("Brian", "Ja'mez"));

        Potato testPotato = new Potato();
        testPotato.addNameToPotato("Brian");
        testPotato.addNameToPotato("Ja'mez");

        ArrayList<String> actualPotato = testPotato.printPotatoDetails();

        assertEquals(expectedPotato, actualPotato);
    }

    @Test
    public void addNameToPotato() {

       String expectedName = "Brian";

       Potato testPotato = new Potato();
       testPotato.addNameToPotato("Brian");

       ArrayList<String> actualPotatoList = testPotato.getPotato();
       String actualName = actualPotatoList.get(0);

        assertEquals(expectedName, actualName);




    }
}