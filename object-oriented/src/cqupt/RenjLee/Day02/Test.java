package cqupt.RenjLee.Day02;

/**
 * @author : RenjieLee
 * @Contact : lirenjie.cqupt@foxmail.com
 * @Time : 2019/9/14 - 4:45
 * @File : Test.py
 * @Description:
 */
public class Test {
    public static void main(String[] args) {
        JavaEE javaEE = new JavaEE("张三", "001");
        Network network = new Network("李四", "002");

        javaEE.work();
        network.work();
    }
}
