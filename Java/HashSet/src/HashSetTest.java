import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.HashSet;

import org.junit.Test;

public class HashSetTest {

	@Test
	public void testCases() {
		String[] pairLeft = {"john","john","john","mary","mary"};
		String[] pairRight = {"tom","mary","tom","anna","anna"};
		HashSet<String> set = new HashSet<>();
		String[] result = {"john tom","john mary","mary anna"};
		set.addAll(Arrays.asList(result));
		assertEquals(HashSetEx.makeHashSet(5,pairLeft,pairRight),set);
	}
}
