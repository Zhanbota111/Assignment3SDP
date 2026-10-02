import renderer.RasterRenderer;
import renderer.Renderer;
import renderer.VectorRenderer;
import shape.Circle;
import shape.Shape;
import shape.Square;

public class Main {
    public static void main(String[] args) {
        Renderer vector = new VectorRenderer();
        Renderer raster = new RasterRenderer();

        // Создаем фигуры с разными рендерерами
        Shape circle = new Circle(vector, 5.0f);
        Shape square = new Square(raster, 10.0f);

        System.out.println("--- Initial Drawing ---");
        circle.draw();
        square.draw();

        System.out.println("\n--- Resizing Shapes ---");
        circle.resize(2.0f);
        circle.draw();

        System.out.println("\n--- Switching Renderer at Runtime ---");
        // Создаем ту же фигуру, но с другим рендерером без изменения класса Circle
        Shape rasterCircle = new Circle(raster, 10.0f);
        rasterCircle.draw();
    }
}