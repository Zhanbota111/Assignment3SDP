import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import renderer.RasterRenderer;
import renderer.Renderer;
import renderer.VectorRenderer;
import shape.Circle;
import shape.Shape;
import shape.Square;

import static org.junit.jupiter.api.Assertions.*;

class ShapeTest {

    private Renderer vectorRenderer;
    private Renderer rasterRenderer;

    @BeforeEach
    void setUp() {
        vectorRenderer = new VectorRenderer();
        rasterRenderer = new RasterRenderer();
    }

    @Test
    @DisplayName("Проверка создания и отрисовки Круга (Vector & Raster)")
    void testCircleDrawing() {
        Shape vectorCircle = new Circle(vectorRenderer, 5.0f);
        Shape rasterCircle = new Circle(rasterRenderer, 5.0f);

        // Проверяем, что объекты создались без ошибок
        assertNotNull(vectorCircle);
        assertNotNull(rasterCircle);

        // Проверяем, что метод draw() исполняется без исключений
        assertDoesNotThrow(vectorCircle::draw);
        assertDoesNotThrow(rasterCircle::draw);
    }

    @Test
    @DisplayName("Проверка создания и отрисовки Квадрата (Vector & Raster)")
    void testSquareDrawing() {
        Shape vectorSquare = new Square(vectorRenderer, 10.0f);
        Shape rasterSquare = new Square(rasterRenderer, 10.0f);

        assertNotNull(vectorSquare);
        assertNotNull(rasterSquare);

        assertDoesNotThrow(vectorSquare::draw);
        assertDoesNotThrow(rasterSquare::draw);
    }

    @Test
    @DisplayName("Проверка изменения размера фигур (resize)")
    void testShapeResize() {
        Shape circle = new Circle(vectorRenderer, 4.0f);
        Shape square = new Square(rasterRenderer, 8.0f);

        // Проверяем, что метод resize() отрабатывает корректно
        assertDoesNotThrow(() -> circle.resize(2.0f));
        assertDoesNotThrow(() -> square.resize(0.5f));
    }
}