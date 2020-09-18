package examen1_tylercruz_progra2;

import java.awt.Color;

public class Articulos {
    private String titulo;
    private Color color;
    private String descripcion;
    private String editorial;
    private int tamano;
    private int puntuacion;
    private Person person;

    public Articulos() {
    }

    public Articulos(String titulo, Color color, String descripcion, String editorial, int tamano, int puntuacion, Person person) {
        this.titulo = titulo;
        this.color = color;
        this.descripcion = descripcion;
        this.editorial = editorial;
        this.tamano = tamano;
        this.puntuacion = puntuacion;
        this.person = person;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public int getTamano() {
        return tamano;
    }

    public void setTamano(int tamano) {
        this.tamano = tamano;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    @Override
    public String toString() {
        return "Articulos{" + "titulo=" + titulo + ", color=" + color + ", descripcion=" + descripcion + ", editorial=" + editorial + ", tamano=" + tamano + ", puntuacion=" + puntuacion + ", person=" + person + '}';
    }
    
    
}
