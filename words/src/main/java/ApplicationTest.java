import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ApplicationTest {
    private Application app;
    
    @Before
    public void setup() {
        app = new Application();
    }
    
    
    @Test
    public void testWordCountString() {
        int count = app.countWords("this is a test");
        assertTrue(count == 4);
    }

    @Test
    public void testWordCountEmpty() {
        int count = app.countWords("");
        assertEquals(0, count);
    }

    @Test
    public void testWordCountNull() {
        int count = app.countWords(null);
        assertEquals(0, count);
    }

    @Test
    @Ignore
    public void testWordCountMore() {
        int count = app.countWords("this will be skipped");
        assertEquals(3, count);
    }

    @Test
    public void testWordCountSingle() {
        int count = app.countWords("test");
        assertEquals(1, count);
    }
}
