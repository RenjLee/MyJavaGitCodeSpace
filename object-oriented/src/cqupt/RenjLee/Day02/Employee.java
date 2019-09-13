package cqupt.RenjLee.Day02;

/**
 * @author : RenjieLee
 * @Contact : lirenjie.cqupt@foxmail.com
 * @Time : 2019/9/14 - 4:33
 * @File : Employee.py
 * @Description:
 */
public abstract class Employee {
    private String name;
    private String id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                '}';
    }

    public abstract void work();
}
