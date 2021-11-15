import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer printer;

    @Before
    public void setUp(){ printer = new Printer(100, 150); }

    @Test
    public void hasPaper(){ assertEquals(100, printer.getPaperCount()); }

    @Test
    public void hasToner(){ assertEquals(150, printer.getTonerVolume()); }

    @Test
    public void canPrint(){
        printer.canPrint(5, 10);
        assertEquals(50, printer.getPaperCount());
        assertEquals(100, printer.getTonerVolume());
    }

    @Test
    public void cannotPrint(){
        assertEquals(false, printer.canPrint(4, 50));
    }
}