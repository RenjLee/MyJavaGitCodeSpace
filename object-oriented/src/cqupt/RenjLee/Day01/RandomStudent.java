package cqupt.RenjLee.Day01;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author : RenjieLee
 * @Contact : lirenjie.cqupt@foxmail.com
 * @Time : 2019/9/13 - 13:39
 * @File : RandomStudent.py
 * @Description: 学生信息，随机抽
 */
public class RandomStudent {
    public static void main(String[] args) {
        ArrayList<Student> array = new ArrayList<>();
        //1.存储所有学生和他们的信息
        addStudent(array);
        //2.打印所有学生信息
        printStudent(array);
        //3.随机抽取一名学生
        RandomStudent(array);
    }

    private static void RandomStudent(ArrayList<Student> array) {
        Random random = new Random(array.size());
        int index = random.nextInt();
        System.out.println();
        System.out.println(array.get(3).toString());
    }

    private static void printStudent(ArrayList<Student> array) {
        for (Student student : array) {
            System.out.println(student.toString());
        }
    }

    private static void addStudent(ArrayList<Student> array) {
        Student student_01 = new Student();
        student_01.setName("张三");
        student_01.setGender("M");
        student_01.setScore(30);

        Student student_02 = new Student();
        student_02.setName("李四");
        student_02.setGender("M");
        student_02.setScore(40);

        Student student_03 = new Student();
        student_03.setName("王五");
        student_03.setGender("F");
        student_03.setScore(50);

        Student student_04 = new Student();
        student_04.setName("赵六");
        student_04.setGender("F");
        student_04.setScore(60);

        Student student_05 = new Student();
        student_05.setName("冯七");
        student_05.setGender("M");
        student_05.setScore(70);

        array.add(student_01);
        array.add(student_02);
        array.add(student_03);
        array.add(student_04);
        array.add(student_05);
    }


}
