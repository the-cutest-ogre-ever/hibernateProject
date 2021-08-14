package ru.ever.ogre.cutest.the.model;

import javax.persistence.*;
import java.util.Set;

public class Project {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    @Column (name = "id")
    private int id;
    @Column (name = "title")
    private String title;
    @Column (name = "description")
    private String description;
    @Column (name = "skillsStack")
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
