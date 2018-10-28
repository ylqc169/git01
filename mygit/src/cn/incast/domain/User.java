package cn.incast.domain;

/**
 * @author abo
 * @title User
 * @ProjectName idea-git-test
 * @Description TODO
 * @CreateDate 2018/10/28-17:53
 */
public class User {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    private String name;
    private Integer age;

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
