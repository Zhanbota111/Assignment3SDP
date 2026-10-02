package shape;

import renderer.Renderer;

// Refined Abstraction 2
public class Square extends Shape {
    private float side;

    public Square(Renderer renderer, float side) {
        super(renderer);
        this.side = side;
    }

    @Override
    public void draw() {
        renderer.renderSquare(side);
    }

    @Override
    public void resize(float factor) {
        this.side *= factor;
    }
}