package cqupt.RenjLee.Day02;

/**
 * @author : RenjieLee
 * @Contact : lirenjie.cqupt@foxmail.com
 * @Time : 2019/9/14 - 4:44
 * @File : Network.py
 * @Description:
 */
public class Network extends Maintainer {
    Network(String name, String id) {
        super.setId(id);
        super.setName(name);
    }

    @Override
    public void work() {
        System.out.println("他是网络工程师，他正在维修打印机" + super.toString());
    }
}
