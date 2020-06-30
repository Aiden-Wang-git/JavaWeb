package day07.com.itheima.b_database.c_warp;

public class QQCar implements Car {

    @Override
    public void run() {
        System.out.println("QQ车在跑");
    }

    @Override
    public void stop() {
        System.out.println("QQ车刹车");
    }
}
