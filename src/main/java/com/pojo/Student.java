package com.pojo;

public class Student {

    private String id;
    private String sname;
    private Integer age;
    private String sex;

    public Student(){

    }
    public Student(String id, String sname, Integer age, String sex) {
        this.id = id;
        this.sname = sname;
        this.age = age;
        this.sex = sex;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getsname() {
        return sname;
    }

    public void setsname(String sname) {
        this.sname = sname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString(){
        return "Student message [id:"+this.id +", name:"+this.sname+", age:"+this.age +", 性别:"+this.sex+"]";
    }
}
