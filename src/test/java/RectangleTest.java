import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RectangleTest {
    @Test
    @DisplayName("Should area be 0 for length 0 and breadth 2")
    void shouldBeZero() {
        Rectangle rectangle = new Rectangle();//Arrange

        int actualArea = rectangle.calculateArea(0, 2); //Action

        assertEquals(0, actualArea); //Assertion
    }

    @Test
    @DisplayName("calculate area for length 2 and breadth 3")
    void shouldBeSixWhenLengthTwoAndBreadthThree() {
        Rectangle rectangle = new Rectangle();
        assertEquals(6, rectangle.calculateArea(2, 3));
    }

    @Test
    @DisplayName("Should perimeter be 0 for length 0 and breadth 0")
    void shouldPerimeterBeZero() {
        Rectangle rectangle = new Rectangle();//Arrange
        int actualArea = rectangle.perimeter(0, 0); //Action
        assertEquals(0, actualArea); //Assertion
    }
}
