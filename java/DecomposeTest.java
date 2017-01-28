import static org.junit.Assert.*;
import org.junit.Test;

public class DecomposeTest {

	@Test
	public void test1() {
		Decompose d = new Decompose();
		long n = 11;
		assertEquals("1 2 4 10", d.decompose(n));
	}
}
