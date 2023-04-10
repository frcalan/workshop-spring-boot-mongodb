package io.frcalan.workshopmongo.dto;

import io.frcalan.workshopmongo.domain.User;

import java.io.Serializable;
import java.util.Optional;

public class UserDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;
    private String name;
    private String email;

    public UserDTO() {
    }

    public UserDTO(Optional<User> obj) {
        this.id = obj.get().getId();
        this.name = obj.get().getName();
        this.email = obj.get().getEmail();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
