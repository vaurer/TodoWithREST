package at.va.todos.todos.model;

import javax.persistence.*;

@Entity
public class Todo {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;
    @Column (name="task_name")
    private String name;
    @Column (name="task_responsible")
    private String responsible;
    @Column
    private Boolean isTaskDone = false;

    public Todo(Integer id, String name, String responsible, Boolean isTaskDone) {
        this.id = id;
        this.name = name;
        this.responsible = responsible;
        this.isTaskDone = isTaskDone;
    }

    public Todo(String name, String responsible) {
        this.name = name;
        this.responsible = responsible;
    }

    public Todo() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getResponsible() {
        return responsible;
    }

    public void setResponsible(String responsible) {
        this.responsible = responsible;
    }

    public Boolean getTaskDone() {
        return isTaskDone;
    }

    public void setTaskDone(Boolean taskDone) {
        isTaskDone = taskDone;
    }
}
