import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SquareTest {
    @Test
    @DisplayName("Should area be 1 when side 1")
    void shouldBeUnitArea() {
        Square square = new Square();//Arrange
        int unitArea = square.area(1); //Action
        assertEquals(1, unitArea); //Assertion
    }

    @Test
    @DisplayName("Should area be 4 when side 2")
    void shouldBeArea4WhenSide2() {
        Square square = new Square();//Arrange
        assertEquals(4, square.area(2)); //Assertion
    }
}
