package renderer;

// Implementor: интерфейс для низкоуровневых операций рендеринга
public interface Renderer {
    void renderCircle(float radius);
    void renderSquare(float side);
}