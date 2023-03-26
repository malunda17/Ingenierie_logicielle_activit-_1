/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package c306activite1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author FServices
 */
 
public class TestTabAlgos{ 
    
   
     @Test
    void testPlusGrand() {
        int[] tab = {1, 2, 3, 4, 5};
        int result = TabAlgos.plusGrand(tab);
        assertEquals(5, result);
    }
    @Test
    void testMoyenne() {
        int[] array = {1, 2, 3, 4, 5};
        double result = TabAlgos.moyenne(array);
        assertEquals(3.0, result);
    }
    
    @Test
    void testEgaux() {
        int[] tab1 = {1, 2, 3};
        int[] tab2 = {1, 2, 3};
        boolean result = TabAlgos.egaux(tab1, tab2);
        assertTrue(result);
    }
    
    @Test
    void testSimilaires() {
        int[] tab1 = {3, 2, 1};
        int[] tab2 = {1, 2, 3};
        boolean result = TabAlgos.similaires(tab1, tab2);
        assertTrue(result);
    }
}

