package ru.ever.ogre.cutest.the.model;

import java.util.ArrayList;
import java.util.Set;

public class Developer {
    private int id;
    private String firstName;
    private String secondName;
    private String speciality;
    private int experience;
    private Set<Skill> skills;
    private ArrayList<Project> projects;

    public Developer() {
    }

    public Developer(String firstName, String secondName, String speciality, int experience) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.speciality = speciality;
        this.experience = experience;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public Set<Skill> getSkills() {
        return skills;
    }

    public void setSkills(Set<Skill> skills) {
        this.skills = skills;
    }

    public ArrayList<Project> getProjects() {
        return projects;
    }

    public void setProjects(ArrayList<Project> projects) {
        this.projects = projects;
    }

    @Override
    public String toString() {
        return "Developer{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", speciality='" + speciality + '\'' +
                ", experience=" + experience +
                ", skills=" + skills +
                ", projects=" + projects +
                '}';
    }
}
