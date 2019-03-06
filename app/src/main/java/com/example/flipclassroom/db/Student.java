package com.example.flipclassroom.db;

import org.litepal.crud.DataSupport;
/**
 * Created by WPH on 2019/3/5.
 * 存放学生信息的表
 */

public class Student extends DataSupport{
    private String StudengtName;
    private String PassWord;

    public String getStudengtName() {
        return StudengtName;
    }

    public void setStudengtName(String studengtName) {
        this.StudengtName = studengtName;
    }

    public String getPassWord() {
        return PassWord;
    }

    public void setPassWord(String passWord) {
        this.PassWord = passWord;
    }
}
