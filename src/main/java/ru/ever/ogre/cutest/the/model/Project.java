package ru.ever.ogre.cutest.the.model;

import java.util.Set;

public class Project {
    private int id;
    private String title;
    private String description;
    private Set<Skill> skillsStack;

    public Project() {
    }

    public Project(String title, String description, Set<Skill> skillsStack) {
        this.title = title;
        this.description = description;
        this.skillsStack = skillsStack;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Set<Skill> getSkillsStack() {
        return skillsStack;
    }

    public void setSkillsStack(Set<Skill> skillsStack) {
        this.skillsStack = skillsStack;
    }

    @Override
    public String toString() {
        return "Project{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", skillsStack=" + skillsStack +
                '}';
    }
}
