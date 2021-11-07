package code.projectantoanfinal.entities;

import javax.persistence.*;
 
@Entity
@Table(name = "roles")
public class Role {

    public Role(Integer id, String name) {
        this.id = id;
        this.name = name;
    }
    
    @Id
    @Column(name = "role_id")
    @GeneratedValue
    private Integer id;
     
    private String name;

    public Role() {

    }

    public Integer getId() {
        return id;
    }
     
    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}