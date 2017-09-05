package com.iteso.tarea01.beans;

/**
 * Created by Palaf on 04/09/2017.
 */

public class Alumno {
    private String nombre;
    private String telefono;
    private String escolaridad;
    private String genero;
    private String libro;
    private String deporte;

    public Alumno(String nombre, String telefono, String escolaridad, String genero, String libro, boolean deporte) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.escolaridad = escolaridad;
        this.genero = genero;
        this.libro = libro;
        this.deporte = deporte?"Si":"No";
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "nombre='" + nombre + '\'' +
                ", telefono='" + telefono + '\'' +
                ", escolaridad='" + escolaridad + '\'' +
                ", genero='" + genero + '\'' +
                ", libro='" + libro + '\'' +
                ", deporte='" + deporte + '\'' +
                '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEscolaridad() {
        return escolaridad;
    }

    public void setEscolaridad(String escolaridad) {
        this.escolaridad = escolaridad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getLibro() {
        return libro;
    }

    public void setLibro(String libro) {
        this.libro = libro;
    }

    public String getDeporte() {
        return deporte;
    }

    public void setDeporte(String deporte) {
        this.deporte = deporte;
    }
}
