public class sprinter {
    public static void main(String[] args){
        Car myCar = new Car(2019, "Audi", "Q5", 0);
        System.out.println(myCar.getMiles());
        myCar.drive(800);
        System.out.println(myCar.getMiles());

        Rectangle myRectangle = new Rectangle(5,5);
        System.out.println(myRectangle.getArea());
        System.out.println(myRectangle.getDiagonal());
        System.out.println(myRectangle.isSquare());
    }

}
