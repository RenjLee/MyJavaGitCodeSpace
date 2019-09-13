package cqupt.RenjLee.Day01;

/**
 * @author : RenjieLee
 * @Contact : lirenjie.cqupt@foxmail.com
 * @Time : 2019/9/13 - 13:35
 * @File : Student.py
 * @Description:
 */
public class Student {
    private String name;
    private String gender;
    private float score;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", score=" + score +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public float getScore() {
        return score;
    }

    public void setScore(float score) {
        this.score = score;
    }
}
