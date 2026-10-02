package shape;

import renderer.Renderer;

// Abstraction: абстрактный класс фигуры, использующий агрегацию Renderer (Bridge)
public abstract class Shape {
    protected Renderer renderer;

    protected Shape(Renderer renderer) {
        this.renderer = renderer;
    }

    public abstract void draw();
    public abstract void resize(float factor);
}