package point_moveablepoint;

public class Main {
    public static void main(String[] args) {
        MoveablePoint moveablePoint = new MoveablePoint(4, 3, 6, 5);
        System.out.println(moveablePoint.toString());
        System.out.println(moveablePoint.move());
        System.out.println(moveablePoint.move());


    }



}
