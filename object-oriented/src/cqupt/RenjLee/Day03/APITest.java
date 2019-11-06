package cqupt.RenjLee.Day03;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author : RenjieLee
 * @Contact : lirenjie.cqupt@foxmail.com
 * @Time : 2019/11/6 - 23:03
 * @File : APITest.py
 * @Description:
 */
public class APITest {
    public static void main(String[] args) {
        //Date
        getDate();
    }

    private static void getDate() {
        System.out.println(new Date(System.currentTimeMillis()));
        SimpleDateFormat df = new SimpleDateFormat("yyyy年MM月dd日");
        System.out.println(df.format(new Date(System.currentTimeMillis())));
    }
}
