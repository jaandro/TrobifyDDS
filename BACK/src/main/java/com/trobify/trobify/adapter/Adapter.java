package com.trobify.trobify.adapter;

import com.trobify.trobify.dto.UserDTO;

public class Adapter implements userAdapter {
    private UserDTO instance;

    public Adapter(UserDTO instance) {
        this.instance = instance;
    }

    @Override
    public int getId() {
        return instance.getId();
    }

    @Override
    public String getNombre() {
        return instance.getName();
    }

    @Override
    public String getApellidos() {
        return instance.getLastName();
    }

    @Override
    public int getTelefono() {
        return instance.getMovil();
    }

    @Override
    public String getPassword() {
        return instance.getPsw();
    }

    @Override
    public String getEmail() {
        return instance.getEmail();
    }
}
