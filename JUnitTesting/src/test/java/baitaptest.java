import com.example.JUnitTesting.testcase;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class baitaptest {
   testcase testcase = new testcase();

    @Test
    void testnhan() {
        assertEquals(15, testcase.bai1(3, 5));
        assertEquals(-35, testcase.bai1(-7, 5));
        assertEquals(-42, testcase.bai1(6, -7));
        assertEquals(56, testcase.bai1(-8, -7));
        assertEquals(0, testcase.bai1(0, 8));
        assertEquals(0, testcase.bai1(9, 0));
        assertEquals(0, testcase.bai1(0, 0));
        assertEquals(250000, testcase.bai1(500, 500));
        assertEquals(-640000, testcase.bai1(-800, 800));
        assertEquals(2, testcase.bai1(2, 1));

    }

    @Test
    void testDivide() {
        assertEquals(3, testcase.bai2(15, 5));
        assertEquals(-4, testcase.bai2(-20, 5));
        assertEquals(-5, testcase.bai2(25, -5));
        assertEquals(6, testcase.bai2(-30, -5));
        assertEquals(0, testcase.bai2(0, 7));
        assertThrows(ArithmeticException.class, () -> testcase.bai2(18, 0));
        assertThrows(ArithmeticException.class, () -> testcase.bai2(-18, 0));
        assertEquals(1, testcase.bai2(8, 8));
        assertEquals(50, testcase.bai2(100, 2));
        assertEquals(-25, testcase.bai2(100, -4));

    }

    @Test
    public void testAverage() {
        assertEquals(4.0, testcase.average(new int[]{2, 4, 6}));
        assertEquals(5.5, testcase.average(new int[]{1, 10}));
        assertEquals(-3.0, testcase.average(new int[]{-1, -2, -3, -4, -5}));
        assertEquals(0.0, testcase.average(new int[]{-5, 5, -10, 10}));
        assertEquals(100.0, testcase.average(new int[]{100, 100, 100}));
        assertEquals(50.0, testcase.average(new int[]{0, 50, 100}));
        assertEquals(7.0, testcase.average(new int[]{7}));
        assertThrows(ArithmeticException.class, () -> testcase.average(new int[]{}));

    }

    @Test
    void testGetElementAtIndex() {
        int[] arr1 = {10, 20, 30, 40, 50};
        assertEquals(30, testcase.getElementAtIndex(arr1, 2));

        int[] arr2 = {-5, -10, -15, -20};
        assertEquals(-15, testcase.getElementAtIndex(arr2, 2));

        int[] arr3 = {100};
        assertEquals(100, testcase.getElementAtIndex(arr3, 0));

        int[] arr4 = {0, 1, 2, 3, 4, 5};
        assertEquals(0, testcase.getElementAtIndex(arr4, 0));
        assertEquals(5, testcase.getElementAtIndex(arr4, 5));

        assertThrows(IndexOutOfBoundsException.class, () -> testcase.getElementAtIndex(arr1, -1));
        assertThrows(IndexOutOfBoundsException.class, () -> testcase.getElementAtIndex(arr2, 10));
        assertThrows(IndexOutOfBoundsException.class, () -> testcase.getElementAtIndex(new int[]{}, 0));

    }

    @Test
    public void testFindMin() {
        assertEquals(1, testcase.PTNhoNhat(new int[]{5, 3, 1, 4, 2}));
        assertEquals(-10, testcase.PTNhoNhat(new int[]{0, -10, -5, 3}));
        assertThrows(IllegalArgumentException.class, () -> testcase.PTNhoNhat(new int[]{}));
    }
}

