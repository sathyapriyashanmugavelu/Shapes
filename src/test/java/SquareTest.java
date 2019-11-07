import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SquareTest {
    @Test
    @DisplayName("Should area be 0 when side 0")
    void shouldAreaBeZero() {
        Square square = new Square();//Arrange
        int actualArea = square.area(0); //Action
        assertEquals(0, actualArea); //Assertion
    }


}
