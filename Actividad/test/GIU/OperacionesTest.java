/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package GIU;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class OperacionesTest {

    @Test
    public void testSuma() {
        String num1 = "2";
        String num2 = "3";
        String operador = "+";
        String expResult = "5";
        String result = Operaciones.calcular(num1, num2, operador);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testResta() {
        String num1 = "5";
        String num2 = "3";
        String operador = "-";
        String expResult = "2";
        String result = Operaciones.calcular(num1, num2, operador);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testMultiplicacion() {
        String num1 = "4";
        String num2 = "3";
        String operador = "*";
        String expResult = "12";
        String result = Operaciones.calcular(num1, num2, operador);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testDivision() {
        String num1 = "10";
        String num2 = "2";
        String operador = "/";
        String expResult = "5";
        String result = Operaciones.calcular(num1, num2, operador);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testModulo() {
        String num1 = "10";
        String num2 = "3";
        String operador = "%";
        String expResult = "1";
        String result = Operaciones.calcular(num1, num2, operador);
        assertEquals(expResult, result);
    }
}
