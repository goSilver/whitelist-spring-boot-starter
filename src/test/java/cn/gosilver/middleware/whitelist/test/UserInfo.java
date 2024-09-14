package cn.gosilver.middleware.whitelist.test;

/**
 * Author: chensh
 * Date: 2024/9/14 2:40 PM
 */
public class UserInfo {
    private String id;
    private Integer age;
    private String address;

    public UserInfo(String id, int age, String address) {
        this.id = id;
        this.age = age;
        this.address = address;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
