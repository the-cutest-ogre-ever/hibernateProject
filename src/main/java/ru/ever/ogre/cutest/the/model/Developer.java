package ru.ever.ogre.cutest.the.model;

public class Developer {
    private int id;
    private String firstName;
    private String secondName;
    private String speciality;
    private int experience;

    public Developer() {
    }

    public Developer(String firstName, String secondName, String speciality, int experience) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.speciality = speciality;
        this.experience = experience;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }
}
