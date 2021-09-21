package com.company.User;

public enum USERINFO {

    PERSON("Pavel","Vorobyev", 20, "MALE");

    private String name;
    private String surname;
    private int age;
    private String gender;

    USERINFO(String name, String surname, int age, String gender) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.gender = gender;

    }

    public void AgeInkrement(){

    }

    public void FullName(){
        System.out.println(name +" "+ surname);
    }

    public void FullInfoAboutUser(){
        System.out.println(name +" "+ surname+" "+ age+" "+ gender);
    }


    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        System.out.println(name);
        return name;
    }

    public String getSurname() {
        System.out.println(surname);
        return surname;
    }

    public int getAge() {
        System.out.println(age);
        return age;

    }

    public String getGender() {
        System.out.println(gender);
        return gender;
    }
}
