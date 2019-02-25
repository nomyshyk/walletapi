package kg.itacademy.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import java.time.LocalDateTime;

@XmlRootElement(name="wallet")
@XmlAccessorType(XmlAccessType.FIELD)
public class Wallet {
    private int id;
    private String name;
    private User id_user;
    private boolean active;
    private LocalDateTime dateCreated;

    public Wallet() {
    }

    public Wallet(int id, String name, User id_user, boolean active, LocalDateTime dateCreated) {
        this.id = id;
        this.name = name;
        this.id_user = id_user;
        this.active = active;
        this.dateCreated = dateCreated;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User getId_user() {
        return id_user;
    }

    public void setId_user(User id_user) {
        this.id_user = id_user;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public LocalDateTime getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(LocalDateTime dateCreated) {
        this.dateCreated = dateCreated;
    }
}
