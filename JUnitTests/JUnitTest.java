package JUnitTests;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;
import Problems.*;


public class JUnitTest {
    @Test
    public void test() {
        assertEquals("()()()())))))))))(()",
                DuplicateEncoder.encode("Persistsalamalalekum"));
        assertEquals("))))())))",DuplicateEncoder.encode("   ()(   "));
    }
}