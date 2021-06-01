package com.trobify.trobify.dto;

public class UserDTO {
    
    public int id;
    public String name;
    public String lastName;
    public String psw;
    private String email;
    private int movil;


    public String getName() {
        return name;
    }


    public void setName(String nombre) {
        this.name = nombre;
    }


    public String getLastName() {
        return lastName;
    }


    public void setLastName(String apellidos) {
        this.lastName = apellidos;
    }


    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }


    public String getPsw() {
        return psw;
    }


    public void setPsw(String password) {
        this.psw = password;
    }


    public String getEmail() {
        return email;
    }


    public void setEmail(String email) {
        this.email = email;
    }


    public int getMovil() {
        return movil;
    }


    public void setMovil(int telefono) {
        this.movil = telefono;
    }

    @Override
    public String toString() {
        return "UserDTO [apellidos=" + lastName + ", email=" + email + ", id=" + id + ", nombre=" + name + ", password=" + psw + ", telefono="
                + movil + "]";
    }

}
