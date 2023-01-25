import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
    
    int[] input2 = { 3, 4, 1, 6, 5 };
    ArrayExamples.reverseInPlace(input2);
    assertArrayEquals(new int[]{ 5, 6, 1, 4, 3 }, input2);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
    
    int[] input2 = { 1, 4, 6, 1, 3, 5 };
    assertArrayEquals(new int[]{ 5, 3, 1, 6, 4, 1}, ArrayExamples.reversed(input2));
  }
  
  @Test
  public void testAverage(){
    double[] input1 = { 1.0, 1.0, 4.0, 5.0, 6.0, 9.0 };
    assertEquals(5.0, ArrayExamples.averageWithoutLowest(input1), 0.0);
  }
}
