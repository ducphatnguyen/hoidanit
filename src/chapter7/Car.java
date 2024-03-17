package chapter7;

public class Car extends Vehicle{
    private String modelName = "Mustang"; // Car attribute
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.honk();
//      Sử dụng thuộc tính protected brand của cha
        System.out.println(myCar.brand + " " + myCar.modelName);
    }

}
