package examen1_tylercruz_progra2;

import java.awt.Color;

public class Juego extends Articulos{
    private int edicion;
    private String casaElaboracion;
    private String pais;

    public Juego() {
    }

    public Juego(int edicion, String casaElaboracion, String pais, String titulo, Color color, String descripcion, String editorial, int tamano, int puntuacion, Person person) {
        super(titulo, color, descripcion, editorial, tamano, puntuacion, person);
        this.edicion = edicion;
        this.casaElaboracion = casaElaboracion;
        this.pais = pais;
    }

    public int getEdicion() {
        return edicion;
    }

    public void setEdicion(int edicion) {
        this.edicion = edicion;
    }

    public String getCasaElaboracion() {
        return casaElaboracion;
    }

    public void setCasaElaboracion(String casaElaboracion) {
        this.casaElaboracion = casaElaboracion;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "Juego{" + "edicion=" + edicion + ", casaElaboracion=" + casaElaboracion + ", pais=" + pais + '}';
    }
    
    
    
}
