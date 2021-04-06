/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.labo;

/**
 *
 * @author anaga
 */
public class Usuario {

    private String Usuario = "Sergio";
    private String password = "Sergio809842";

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Usuario{User=").append(Usuario);
        sb.append("Usuario(password=").append(password);
        sb.append('}');
        return sb.toString();
    }

    public Usuario(String nombre, String password) {
        this.Usuario = nombre;
        this.password = password;
    }

    public Usuario() {
    }

    /**
     * @return the nombre
     */
    public String getUser() {
        return Usuario;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.Usuario = nombre;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Metodo control nombre de usuario correcto, minimo 6 caracteres
     *
     * @param nombre a chequear
     * @return true si el nombre es valido
     */
    public boolean checkNombre(String nombre) {
        return nombre.length() >= 6;
    }

    /**
     * Metodo control password correcto
     */
    public boolean checkPassword(String passw) {
        boolean ok = false;
        if (passw.matches(".*[A-Z].*") && passw.length() >= 8) {
            ok = true;
        }
        return ok;
    }
}
