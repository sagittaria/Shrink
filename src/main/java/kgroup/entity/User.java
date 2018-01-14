package kgroup.entity;

import java.io.Serializable;

public class User implements Serializable {
    private String _id;
    private String name;
    private String gender;
    private String birthday;
    private String[] hobby;
    private String major;

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
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

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String[] getHobby() {
        return hobby;
    }

    public void setHobby(String[] hobby) {
        this.hobby = hobby;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public User(String _id, String name, String gender, String birthday, String[] hobby, String major) {
        super();
        this._id = _id;
        this.name = name;
        this.gender = gender;
        this.birthday = birthday;
        this.hobby = hobby;
        this.major = major;
    }

    public User() {

    }

    @Override
    public String toString() {
        return "Student [id=" + _id + ", name=" + name + ", birthday=" + birthday + "]";
    }
}