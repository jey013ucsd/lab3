import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 1, 2, 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3, 2 , 1 }, input1);
	}


  @Test
  public void testReversed() {
    int[] input1 = {1, 2, 3};
    assertArrayEquals(new int[]{3, 2 ,1}, ArrayExamples.reversed(input1));
  }

  @Test
  public void testaverageWithoutLowest() {
    double[] input1 = {2.0, 2.0, 6.0};
    assertEquals(4.0, ArrayExamples.averageWithoutLowest(input1), 0.0);
  }
}
