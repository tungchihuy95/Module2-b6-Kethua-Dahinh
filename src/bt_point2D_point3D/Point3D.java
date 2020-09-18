package bt_point2D_point3D;

public class Point3D extends Point2D{
    private double z = 0.0f;

    public Point3D() {
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        super.setXY(x, y);
        this.setZ(z);
    }

    @Override
    public String toString() {
        return "Point3D{" +
                "z=" + z + ", x = " + getX() + ", y = " + getY() +
                '}';
    }
}
