package com.lngupta.springboot.basics.models;

import com.lngupta.springboot.basics.utils.Constants;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

//@Getter
//@Setter
public class User {
    private UUID uuid;
    private String name;
    private Constants.Gender gender;

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Constants.Gender getGender() {
        return gender;
    }

    public void setGender(Constants.Gender gender) {
        this.gender = gender;
    }

    public User(String name, Constants.Gender gender) {
        this.uuid = UUID.randomUUID();
        this.name = name;
        this.gender = gender;
    }
}
