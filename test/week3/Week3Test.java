package week3;
import org.junit.Test;
import static org.junit.Assert.*;
public class Week3Test {
    

    // TODO: Viết 5 testcase cho phương thức max()
    @Test
    public void testmax(){
        assertEquals(46,Week3.max(46,10));
        assertEquals(4,Week3.max(4,0));
        assertEquals(-56,Week3.max(675,-56));
        assertEquals(0,Week3.max(0,-9));
        assertEquals(45,Week3.max(45,45));
    }

    // TODO: Viết 5 testcase cho phương thức minOfArray()
    public void testminOfArray(){
        int[] array1={3,6,9,10,456,-6,0,356,12};
        assertEquals(-6,Week3.minOfArray(array1));
        int[] array2={1,2,3,4,5,6,7,8,9,10,0};
        assertEquals(0,Week3.minOfArray(array2));
        int[] array3={35,0,-54,63,2,4,1};
        assertEquals(-54,Week3.minOfArray(array3));
        int[] array4={80,68,85,90,-7,3476};
        assertEquals(-7,Week3.minOfArray(array4));
        int[] array5={4,3,7,24,76,1,17,55,28,8};
        assertEquals(1,Week3.minOfArray(array5));
    }

    // TODO: Viết 5 testcase cho phương thức calculateBMI()
    public void testcalculateBMI(){
        assertEquals("Binh thuong", Week3.calculateBMI(50, 1.63));
        assertEquals("Binh thuong", Week3.calculateBMI(65, 1.75));
        assertEquals("Thieu can", Week3.calculateBMI(55, 1.82));
        assertEquals("Beo phi", Week3.calculateBMI(70, 1.50));
        assertEquals("Thua can", Week3.calculateBMI(58, 1.55));
    }
}
