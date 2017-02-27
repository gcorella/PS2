package pkgEmpty;
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import pkgEmpty.MyInteger;
public class TestPS2 {
    
    public static MyInteger one;
    public static MyInteger two;
    public static MyInteger three;

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        one = new MyInteger(5);
        two = new MyInteger(3);
        three = new MyInteger(8); 
    }
    @AfterClass
    public static void tearDownAfterClass() throws Exception {
    }
    @Before
    public void setUp() throws Exception {
    }
    @After
    public void tearDown() throws Exception {
    }
    //******************************************************
    public void isNotEvenTest(){
        assertFalse("5 is no an even number", one.isEven(5));
    }
    public void isEvenTest(){
        assertTrue("8 is an even number", three.isEven(8));
    }
    public void isOddTest(){
        assertTrue("5 is an odd number",one.isOdd(5));
    }
    public void isNotOddTest(){
        assertFalse("8 is not an odd number",three.isOdd(8));
    }
    public void isPrimeTest(){
        assertTrue("3 is a prime number",two.isPrime(3));
    }
    public void isNotPrimeTest(){
        assertFalse("8 is not a prime number",three.isPrime(8));
    }
    public void isEven(){
        assertTrue("This is an even number",three.isEven(8));
    }
    public void isNotEven(){
        assertFalse("This is not an even number",one.isEven(5));
    }
    public void isOdd(){
        assertTrue("This is an odd number",two.isOdd(3));
    }
    public void isNotOdd(){
        assertFalse("This is not an odd number",three.isOdd(8));
    }
    public void isPrime(){
        assertTrue("This is a prime number",two.isPrime(3));
    }
    public void isNotPrime(){
        assertFalse("This is not a prime number",three.isPrime(8));
    }
    //**************************************
    public void isEvenMyInteger(){
        assertTrue("This is an even number",three.isEven(8));
    }
    public void isNotEvenMyInteger(){
        assertFalse("This is not an even number",one.isEven(5));
    }
    
    public void isOddMyInteger(){
        assertTrue("This is an odd number",two.isOdd(3));
    }
    public void isNotOddMyInteger(){
        assertFalse("This is not an odd number",three.isOdd(8));
    }
    public void isPrimeMyIntger(){
        assertTrue("This is a prime number",two.isPrime(3));
    }
    public void isNotPrimeMyInteger(){
        assertFalse("This is not a prime number",three.isPrime(8));
    }
    //*********************************************************
    public void isEqualsInt(){
        assertTrue("This number is equal to 5",one.equals(5));
    }
    public void isNotEqualsInt(){
        assertFalse("This number is not equal to 5",two.equals(5));
    }
    //************************EQUALS*******************************
    public void isEqualsMyInteger(){
        assertTrue("This number is equal to 3",two.equals(3));
    }
    public void isNotEqualsMyInteger(){
        assertFalse("This number is not equal to 3",three.equals(3));
    }
}

