package phepchia;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestPhepChia {
    @Test
    public void testPass(){
        assertEquals(2, PhepChia.tinh(8, 4));
        assertEquals(0, PhepChia.tinh(4, 8));
    }
    
    @Test
    public void testFail(){
        assertEquals(3, PhepChia.tinh(4, 2));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testByZero(){
        PhepChia.tinh(3, 0);
    }
}
