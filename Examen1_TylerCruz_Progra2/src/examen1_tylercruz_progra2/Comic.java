package examen1_tylercruz_progra2;

import java.awt.Color;

public class Comic extends Articulos{
    private double volumen;
    private String descripcionComic;
    private int estadoCalidad;

    public Comic() {
    }

    public Comic(double volumen, String descripcionComic, int estadoCalidad, String titulo, Color color, String descripcion, String editorial, int tamano, int puntuacion, Person person) {
        super(titulo, color, descripcion, editorial, tamano, puntuacion, person);
        this.volumen = volumen;
        this.descripcionComic = descripcionComic;
        this.estadoCalidad = estadoCalidad;
    }

    public double getVolumen() {
        return volumen;
    }

    public void setVolumen(double volumen) {
        this.volumen = volumen;
    }

    public String getDescripcionComic() {
        return descripcionComic;
    }

    public void setDescripcionComic(String descripcionComic) {
        this.descripcionComic = descripcionComic;
    }

    public int getEstadoCalidad() {
        return estadoCalidad;
    }

    public void setEstadoCalidad(int estadoCalidad) {
        this.estadoCalidad = estadoCalidad;
    }

    @Override
    public String toString() {
        return "Comic{" + "volumen=" + volumen + ", descripcionComic=" + descripcionComic + ", estadoCalidad=" + estadoCalidad + '}';
    }
    
    
    
    
    
}
