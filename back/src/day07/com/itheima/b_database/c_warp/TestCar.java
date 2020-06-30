package day07.com.itheima.b_database.c_warp;

public class TestCar {
    public static void main(String[] args) {
        QQCar qqCar = new QQCar();
//        qqCar.run();
//        qqCar.stop();
        CarWarp carWarp = new CarWarp(qqCar);
        carWarp.run();
        carWarp.stop();
    }
}
