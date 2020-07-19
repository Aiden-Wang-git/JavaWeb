package itheima.domain;

public class HelloMyServlet {
    public void add(){
        System.out.println("这是空参的add方法！");
    }
    public int add(int a,int b){
        System.out.println("这是两个参数的add方法");
        return a+b;
    }
    public int add(int i){
        System.out.println("这是一个数加上10的结果！");
        return i+10;
    }
}
