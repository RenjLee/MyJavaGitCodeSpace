package cqupt.RenjLee.Day02;

/**
 * @author : RenjieLee
 * @Contact : lirenjie.cqupt@foxmail.com
 * @Time : 2019/9/14 - 4:43
 * @File : JavaEE.py
 * @Description:
 */
public class JavaEE extends Develop {
    JavaEE(String name, String id) {
        super.setId(id);
        super.setName(name);
    }

    @Override
    public void work() {
        System.out.println("javaEE工程师，他在学习java" + super.toString());
    }
}
