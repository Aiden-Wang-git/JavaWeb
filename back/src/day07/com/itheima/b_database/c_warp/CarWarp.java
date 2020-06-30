package day07.com.itheima.b_database.c_warp;

public class CarWarp implements Car{
    private Car car;

    public CarWarp(Car car) {
        this.car = car;
    }

    @Override
    public void run() {
        System.out.println("改装车跑起来了");
    }

    @Override
    public void stop() {
        car.stop();
    }
}
