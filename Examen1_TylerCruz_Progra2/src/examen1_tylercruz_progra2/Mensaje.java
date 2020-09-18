package examen1_tylercruz_progra2;

public class Mensaje {
    private String receptor;
    private String emisor;
    private String contenido;

    public Mensaje() {
    }

    public Mensaje(String receptor, String emisor, String contenido) {
        this.receptor = receptor;
        this.emisor = emisor;
        this.contenido = contenido;
    }

    public String getReceptor() {
        return receptor;
    }

    public void setReceptor(String receptor) {
        this.receptor = receptor;
    }

    public String getEmisor() {
        return emisor;
    }

    public void setEmisor(String emisor) {
        this.emisor = emisor;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    @Override
    public String toString() {
        return "Mensaje{" + "receptor=" + receptor + ", emisor=" + emisor + ", contenido=" + contenido + '}';
    }
    
    
}
