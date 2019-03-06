package com.example.flipclassroom.db;

import org.litepal.crud.DataSupport;

/**
 * Created by WPH on 2019/3/5.
 * 存放老师信息的表
 */
public class Teacher extends DataSupport{
    private String TeacherName;
    private String PassWord;

    public String getTeacherName() {
        return TeacherName;
    }

    public void setTeacherName(String teacherName) {
        this.TeacherName = teacherName;
    }

    public String getPassWord() {
        return PassWord;
    }

    public void setPassWord(String passWord) {
        this.PassWord = passWord;
    }
}
