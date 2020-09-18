package examen1_tylercruz_progra2;

public class Personal extends Person{
    private String ocupacion;
    private String Horario;
    private int semanas;
    private double sueldo;

    public Personal() {
    }

    public Personal(String ocupacion, String Horario, int semanas, double sueldo, String ID, String name, int edad, String sexo, String estadoCivil, double altura, int peso) {
        super(ID, name, edad, sexo, estadoCivil, altura, peso);
        this.ocupacion = ocupacion;
        this.Horario = Horario;
        this.semanas = semanas;
        this.sueldo = sueldo;
    }
    

    

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public String getHorario() {
        return Horario;
    }

    public void setHorario(String Horario) {
        this.Horario = Horario;
    }

    public int getSemanas() {
        return semanas;
    }

    public void setSemanas(int semanas) {
        this.semanas = semanas;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "Personal{" + "ocupacion=" + ocupacion + ", Horario=" + Horario + ", semanas=" + semanas + ", sueldo=" + sueldo + '}';
    }
    
    
}
