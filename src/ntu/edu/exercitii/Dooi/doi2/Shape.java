package ntu.edu.exercitii.Dooi.doi2;

/**
 * Created by daniel.gherasim on 10/28/2015.
 */
public class Shape {
    private String color;
    private boolean filled;

    public  Shape(){
        color = "red";
        filled = true;
    }
    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "A shape with " +
                "color='" + color + '\'' +
                "abd filled/not filled " + filled +
                ' ';
    }
}
