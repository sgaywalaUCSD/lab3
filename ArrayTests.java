import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
        int[] input1 = { 3 };
        ArrayExamples.reverseInPlace(input1);
        assertArrayEquals(new int[]{ 3 }, input1);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }


  @Test 
	public void testReverseInPlace2() {
        int[] input1 = { 3, 7, 9 };
        ArrayExamples.reverseInPlace(input1);
        assertArrayEquals(new int[]{ 9, 7, 3 }, input1);

        int[] input2 = { 3, 7, 9 , 11};
        ArrayExamples.reverseInPlace(input2);
        assertArrayEquals(new int[]{ 11, 9, 7, 3 }, input2);
	}

/*   @Test
  public void testReversed2InClass() {
    int[] input1 = { 3, 7, 9 };
    assertArrayEquals(new int[]{9, 7, 3}, ArrayExamples.reversed(input1));
    int[] input2 = { 3, 7, 9 , 11};
    assertArrayEquals(new int[]{11, 9, 7, 3}, ArrayExamples.reversed(input2));
  } */

/*   @Test
  public void testAverageWithoutLowest(){
    double[] input1 = {1,1,4,4};
    assertEquals(ArrayExamples.averageWithoutLowest(input1), 3, 0.001);

    

    //For example, the input {1, 1, 4, 4} should either return 3 or 8/3. 
  } */


  @Test
  public void testReversed1(){
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  @Test
  public void testReversed2(){
    int[] input1 = { 5, 7 };
    assertArrayEquals(new int[]{ 7, 5 }, ArrayExamples.reversed(input1));
  }

}
