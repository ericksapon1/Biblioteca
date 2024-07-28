//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class Usuario {
    private String nombre;
    private String apellido;
    private String correoElectronico;
    private String numeroIdentificacion;

    public Usuario(String nombre, String apellido, String correoElectronico, String numeroIdentificacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.correoElectronico = correoElectronico;
        this.numeroIdentificacion = numeroIdentificacion;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreoElectronico() {
        return this.correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getNumeroIdentificacion() {
        return this.numeroIdentificacion;
    }

    public void setNumeroIdentificacion(String numeroIdentificacion) {
        this.numeroIdentificacion = numeroIdentificacion;
    }

    public String toString() {
        return "Usuario{nombre='" + this.nombre + "', apellido='" + this.apellido + "', correoElectronico='" + this.correoElectronico + "', numeroIdentificacion='" + this.numeroIdentificacion + "'}";
    }
}
