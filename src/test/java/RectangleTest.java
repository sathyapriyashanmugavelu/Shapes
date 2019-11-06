import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RectangleTest {

    private static Rectangle rectangle;

     @BeforeAll
     public static void initRectangle(){
         rectangle = new Rectangle();
     }

    @Test
    @DisplayName("calculate area for length 0 and breadth 2")
    public void shouldBeZero() {
        assertEquals(0,rectangle.calculateArea(0,2));
    }

    @Test
    @DisplayName("calculate area for length 2 and breadth 3")
    public void shouldBeSixWhenLengthTwoAndBreadthThree() {
        assertEquals(6,rectangle.calculateArea(2,3));
    }

}
