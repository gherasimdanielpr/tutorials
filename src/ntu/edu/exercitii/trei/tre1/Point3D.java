package ntu.edu.exercitii.trei.tre1;

/**
 * Created by daniel.gherasim on 10/28/2015.
 */
public class Point3D extends Point {
    private int z;



    public Point3D(int x, int y, int z) {

        super(x, y);
        this.z = z;
    }

    public int getZ() {
        return z;
    }
    public void setZ(int z) {
        this.z = z;
    }

    @Override
    public String toString() {
        return "(" + super.getX() + "," + super.getY() + "," + z + ")";
    }
}
