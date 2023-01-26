import static org.junit.Assert.*;
import org.junit.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListTests {

    @Test
    public void testFilter(){
        StringChecker sc = new StringCheckerImplementation("a");
        List<String> input = Arrays.asList(
            new String[] {"a", "b", "c", "ab", "ac", "poop", "poopa"});
        String[] expected = 
            new String[] {"a", "ab", "ac", "poopa"};
        List<String> output = ListExamples.filter(input, sc);
        assertArrayEquals(expected, output.toArray());
    }

    @Test
    public void testMerge(){
        List<String> input1 = Arrays.asList(new String[]{"a", "b", "c"});
        List<String> input2 = Arrays.asList(new String[]{"b", "d"});
        String[] expectedOutput = 
            new String[]{"a", "b", "b", "c", "d"};
        assertArrayEquals(expectedOutput, 
            ListExamples.merge(input1, input2).toArray());
    }



}
