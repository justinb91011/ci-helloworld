import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ArrayUtilsTest {

    @Test
    public void testFindLastNull() {
        assertThrows(NullPointerException.class, () -> {ArrayUtils.findLast(null, 3);});
    }

    @Test
    public void testFindLastEmpty() {
        assertEquals(-1, ArrayUtils.findLast(new int[]{}, 3));
    }

    @Test
    public void testFindLastNonExistent() {
        assertEquals(-1, ArrayUtils.findLast(new int[]{1, 2}, 3));
    }

    @Test
    public void testFindLastExistsFirstElement() {
        assertEquals(0, ArrayUtils.findLast(new int[]{2, 3, 5}, 2));
    }

    @Test
    public void testOddOrPosNull() {
        assertThrows(NullPointerException.class, () -> {ArrayUtils.oddOrPos(null);});
    }

    @Test
    public void testOddOrPosAllPositives() {
        assertEquals(3, ArrayUtils.oddOrPos(new int[]{1, 2, 3}));
    }

    @Test
    public void testOddOrPositiveBothPositivesAndNegatives() {
        assertEquals(3, ArrayUtils.oddOrPos(new int[]{-3, -2, 0, 1, 4}));
    }

    @Test
    public void testCountOfNull() {
        assertThrows(NullPointerException.class, () -> {ArrayUtils.countOf(null, 3);});
    }

    @Test
    public void testCountOfEmpty() {
        assertEquals(0, ArrayUtils.countOf(new int[]{}, 5));
    }

    @Test
    public void testCountOfTargetFound() {
        assertEquals(3, ArrayUtils.countOf(new int[]{1, 2, 1, 3, 1}, 1));
    }

    @Test
    public void testCountOfTargetNotFound() {
        assertEquals(0, ArrayUtils.countOf(new int[]{1, 2, 3}, 5));
    }
}
