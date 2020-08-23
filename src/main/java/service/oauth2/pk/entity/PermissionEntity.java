package service.oauth2.pk.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "permission")
public class PermissionEntity implements Serializable {

    @Id
    @Column(name = "ID")
    private Integer id;
    @Column(name = "NAME")
    private String name;

    public PermissionEntity() {
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
}
