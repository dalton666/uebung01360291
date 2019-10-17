import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class EinstiegsbeispielTest {


    @Test
    void positiveTest1() {
        assertEquals(0, Einstiegsbeispiel.binary2decimal(0));
    }

    @Test
    void positiveTest2() {
        assertEquals(15, Einstiegsbeispiel.binary2decimal(1111));
    }

    @Test
    void negativeTest1() {
        assertEquals(-1, Einstiegsbeispiel.binary2decimal(-1111));
    }

    @Test
    void negativeTest2() {
        assertEquals(-1, Einstiegsbeispiel.binary2decimal(-1));
    }


}