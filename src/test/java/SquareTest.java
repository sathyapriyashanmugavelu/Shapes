import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SquareTest {
    @Test
    @DisplayName("Should area be 0 when side 0")
    void shouldAreaBeZero() {
        Square square = new Square();//Arrange
        int unitArea = square.area(1); //Action
        assertEquals(1, unitArea); //Assertion
    }
}
