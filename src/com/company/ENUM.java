package com.company;

public enum ENUM {

    WINTER("February, December, January", " is Winter"),
    SUMMER("June, July, August"," is Summer"),
    AUTUMN("September, November, October"," is Autumn"),
    SPRING("March, May, April"," is Spring");

    private String ss;
    private String mounth;

    ENUM(String mounth, String ss) {
        this.mounth = mounth;
        this.ss = ss;
    }

    public String getMounth() {
        return mounth;
    }

    public String getSs() {
        return ss;
    }

    public void infoAboutSpring(){
        System.out.println(mounth + ss);
    }
    public void infoAboutSummer(){
        System.out.println(mounth + ss);
    }
    public void infoAboutAutumn(){
        System.out.println(mounth + ss);
    }
    public void infoAboutWinter(){
        System.out.println(mounth + ss);
    }

}
