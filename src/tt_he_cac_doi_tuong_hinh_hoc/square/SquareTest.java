package tt_he_cac_doi_tuong_hinh_hoc.square;


    public class SquareTest {
        public static void main(String[] args) {
            Square square = new Square();
            System.out.println(square);

            square = new Square(2.3);
            System.out.println(square);

            square = new Square(5.8, "yellow", true);
            System.out.println(square);
        }
    }

