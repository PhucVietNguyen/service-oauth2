package service.oauth2.pk.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "permission", schema = "db_auth")
public class PermissionEntity implements Serializable {

    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "db_auth.permission_id_seq")
    private Integer id;
    @Column(name = "name")
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
