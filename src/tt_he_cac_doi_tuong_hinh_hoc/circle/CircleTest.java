package tt_he_cac_doi_tuong_hinh_hoc.circle;

import tt_he_cac_doi_tuong_hinh_hoc.circle.Circle;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);

        circle = new Circle(3.5);
        System.out.println(circle);

        circle = new Circle(3.5, "indigo", false);
        System.out.println(circle);
    }
}
