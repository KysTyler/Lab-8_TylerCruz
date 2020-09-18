package examen1_tylercruz_progra2;

import java.awt.Color;

public class Figura extends Articulos{
    private String descriptionFig;
    private String instructions;
    private String garantia;

    public Figura() {
    }
    

    public Figura(String descriptionFig, String instructions, String garantia, String titulo, Color color, String descripcion, String editorial, int tamano, int puntuacion, Person person) {
        super(titulo, color, descripcion, editorial, tamano, puntuacion, person);
        this.descriptionFig = descriptionFig;
        this.instructions = instructions;
        this.garantia = garantia;
    }

    public String getDescriptionFig() {
        return descriptionFig;
    }

    public void setDescriptionFig(String descriptionFig) {
        this.descriptionFig = descriptionFig;
    }

    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    public String getGarantia() {
        return garantia;
    }

    public void setGarantia(String garantia) {
        this.garantia = garantia;
    }

    @Override
    public String toString() {
        return "Figura{" + "descriptionFig=" + descriptionFig + ", instructions=" + instructions + ", garantia=" + garantia + '}';
    }
    
}
