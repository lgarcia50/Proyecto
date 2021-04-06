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
public class Paciente {
    public String nombre;
    public String trabajo;
    public int piezas;
    public float precio;

    public Paciente() {
    }

    Paciente(String nombre, String trabajo, int piezas, float precio) {
    }

    @Override
    public String toString() {
        return "Paciente{" + "nombre=" + nombre + ", trabajo=" + trabajo + ", piezas=" + piezas + ", precio=" + precio + '}';
    }

    public String getNombre() {
        return nombre;
    }

    public String getTrabajo() {
        return trabajo;
    }

    public int getPiezas() {
        return piezas;
    }

    public float getPrecio() {
        return precio;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTrabajo(String trabajo) {
        this.trabajo = trabajo;
    }

    public void setPiezas(int piezas) {
        this.piezas = piezas;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

}
