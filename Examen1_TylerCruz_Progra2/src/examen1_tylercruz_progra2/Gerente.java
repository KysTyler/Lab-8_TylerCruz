package examen1_tylercruz_progra2;

public class Gerente extends Person{
    private String usuario;
    private String contrasena;
    private String Cargo;

    public Gerente() {
    }

    public Gerente(String usuario, String contrasena, String Cargo, String ID, String name, int edad, String sexo, String estadoCivil, double altura, int peso) {
        super(ID, name, edad, sexo, estadoCivil, altura, peso);
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.Cargo = Cargo;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getCargo() {
        return Cargo;
    }

    public void setCargo(String Cargo) {
        this.Cargo = Cargo;
    }

    @Override
    public String toString() {
        return "Gerente{" + "usuario=" + usuario + ", contrasena=" + contrasena + ", Cargo=" + Cargo + '}';
    }
    
    
    
}
