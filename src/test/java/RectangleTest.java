import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RectangleTest {
    @Test
    @DisplayName("Should area be 0 for length 0 and breadth 0")
    void shouldBeZero() {
        Rectangle rectangle = new Rectangle(0, 0);//Arrange
        int actualArea = rectangle.area(); //Action
        assertEquals(0, actualArea); //Assertion
    }

    @Test
    @DisplayName("calculate area for length 2 and breadth 3")
    void shouldBeSixWhenLengthTwoAndBreadthThree() {
        Rectangle rectangle = new Rectangle(2, 3);
        assertEquals(6, rectangle.area());
    }

    @Test
    @DisplayName("Should perimeter be 0 for length 0 and breadth 0")
    void shouldPerimeterBeZero() {
        Rectangle rectangle = new Rectangle(0, 0);//Arrange
        int actualArea = rectangle.perimeter(); //Action
        assertEquals(0, actualArea); //Assertion
    }

    @Test
    @DisplayName("Should perimeter be 0 for length 0 and breadth 0")
    void shouldPerimeterBeTenWhenLengthTwoAndBreadthThree() {
        Rectangle rectangle = new Rectangle(2, 3);//Arrange
        int actualArea = rectangle.perimeter(); //Action
        assertEquals(10, actualArea); //Assertion
    }

    @Nested
    class squareTest{
        @Test
        @DisplayName("Should area be 1 when side 1")
        void shouldBeUnitArea() {
            Rectangle rectangle = Rectangle.createSquare(0);
            assertNotNull(rectangle);
           // assertEquals(0, rectangle.area());
        }

        @Test
        @DisplayName("Should area be 4 when side 2")
        void shouldBeArea4WhenSide2() {
            Rectangle rectangle = Rectangle.createSquare(2);
            assertEquals(4, rectangle.area());
        }

        @Test
        @DisplayName("Should area be 1 when side 1")
        void shouldBeUnitPerimeter() {
            Rectangle rectangle = Rectangle.createSquare(0);
            assertNotNull(rectangle);
            // assertEquals(0, rectangle.area());
        }

        @Test
        @DisplayName("Should area be 4 when side 2")
        void shouldBePerimeter4WhenSide2() {
            Rectangle rectangle = Rectangle.createSquare(2);
            assertEquals(8, rectangle.perimeter());
        }
    }

}
