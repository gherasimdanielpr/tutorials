package ntu.edu.exercitii.patru.patru4;

/**
 * Created by daniel.gherasim on 10/30/2015.
 */
public class ResizableCircle extends Circle implements Resizable {

    public ResizableCircle(double radius) {
        super(radius);
    }

    @Override
    public int resize(int percent) {
        return percent;
    }
}
