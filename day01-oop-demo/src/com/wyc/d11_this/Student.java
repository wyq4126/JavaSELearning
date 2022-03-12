package com.wyc.d11_this;

public class Student {
    String name;
    String schoolName;

    public Student() {

    }

    /**
     * 如果学生不填写学校，默认学校名称是黑马
     */
    public Student(String name) {
        this(name, "华南师范大学");
    }

    public Student(String name, String schoolName) {
        this.name = name;
        this.schoolName = schoolName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }
}
