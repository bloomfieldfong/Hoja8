import static org.junit.Assert.*;

public class Test {

	@org.junit.Test
	public void test() {
		VectorHeap<String> vector = new VectorHeap<>();
		vector.add("1");
		vector.add("2");
		vector.add("3");
        assertEquals(3, vector.size());
     
	}

} 			
