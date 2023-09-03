package factoryMethod;

import java.awt.*;

public class ShapeFactory {
    private Food food;

    public ShapeFactory(Food food) {
        this.food = food;
    }

    public ShapeFactory() {
    }

    public String getFoodShape() {
        return food.getShape();
    }

    public void setFood(Food food) {
        this.food = food;
    }

    public Food getFood() {
        return food;
    }
}
