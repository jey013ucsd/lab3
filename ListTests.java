import static org.junit.Assert.*;
import org.junit.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class ListTests {
	@Test 
	public void testFilter() {
    ArrayList<String> input1 = new ArrayList<>(Arrays.asList("one", "two", "three"));
	ArrayList<String> output = new ArrayList<>(Arrays.asList("one", "two", "three"));

    assertArrayEquals(output.toArray(), ListExamples.filter(input1, new isStringChecker()).toArray());
	}

	@Test 
	public void testMerge() {
    ArrayList<String> input1 = new ArrayList<>(Arrays.asList("a", "c"));
	ArrayList<String> input2 = new ArrayList<>(Arrays.asList("b", "d"));
	ArrayList<String> output = new ArrayList<>(Arrays.asList("a", "b", "c", "d"));

    assertArrayEquals(output.toArray(), ListExamples.merge(input1, input2).toArray());
	}
}
