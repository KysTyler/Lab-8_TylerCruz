package examen1_tylercruz_progra2;

import java.util.ArrayList;

public class Person {
    private String ID;
    private String name;
    private int edad;
    private String sexo;
    private String estadoCivil;
    private double altura;
    private int peso;
    private ArrayList mensaje = new ArrayList();

    public Person() {
    }
    

    public Person(String ID, String name, int edad, String sexo, String estadoCivil, double altura, int peso) {
        this.ID = ID;
        this.name = name;
        this.edad = edad;
        this.sexo = sexo;
        this.estadoCivil = estadoCivil;
        this.altura = altura;
        this.peso = peso;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public ArrayList getMensaje() {
        return mensaje;
    }

    public void setMensaje(ArrayList mensaje) {
        this.mensaje = mensaje;
    }

    @Override
    public String toString() {
        return "Person{" + "ID=" + ID + ", name=" + name + ", edad=" + edad + ", sexo=" + sexo + ", estadoCivil=" + estadoCivil + ", altura=" + altura + ", peso=" + peso + ", mensaje=" + mensaje + '}';
    }
    
}
