import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {

    WaterBottle waterBottle;

    @Before
    public void setUp  () { waterBottle = new WaterBottle(); }

    @Test
    public void hasVolumeStartOneHundred(){
        assertEquals(100, waterBottle.getVolume()); }

    @Test
    public void canLowerVolumeByTen(){
        assertEquals(90, waterBottle.subtractTenFromVolume()); }

    @Test
    public void canSetToZero(){
        assertEquals(0, waterBottle.setVolumeToZero()); }

    @Test
    public void canSetToOneHundred(){
        assertEquals(100, waterBottle.setVolumeToOneHundred()); }
}
