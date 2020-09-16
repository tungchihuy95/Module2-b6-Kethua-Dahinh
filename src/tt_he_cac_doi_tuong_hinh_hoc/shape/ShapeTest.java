package tt_he_cac_doi_tuong_hinh_hoc.shape;

import tt_he_cac_doi_tuong_hinh_hoc.shape.Shape;

public class ShapeTest {
    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println(shape);

        Shape shape1 = new Shape("red", false);
        System.out.println(shape1);
    }
}