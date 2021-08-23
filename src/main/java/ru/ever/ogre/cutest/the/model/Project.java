package ru.ever.ogre.cutest.the.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "Projects")
public class Project {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    @Column (name = "id")
    private int id;
    @Column (name = "title")
    private String title;
    @Column (name = "description")
    private String description;
    @Column (name = "skills")
    private Set<Skill> skills;

    public Project() {
    }

    public Project(String title, String description, Set<Skill> skills) {
        this.title = title;
        this.description = description;
        this.skills = skills;
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

    public Set<Skill> getSkills() {
        return skills;
    }

    public void setSkills(Set<Skill> skills) {
        this.skills = skills;
    }

    @Override
    public String toString() {
        return "Project{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", skillsStack=" + skills +
                '}';
    }
}
