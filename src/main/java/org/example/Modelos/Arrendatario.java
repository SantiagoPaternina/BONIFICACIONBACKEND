package org.example.Modelos;

public class Arrendatario
{
    private Long id;
    private String nombre;
    private String apellido;
    private String cedula;
    private String nacionalidad;
    private String estadoCivil;
    private String correo;

    public Arrendatario() {
    }

    public Arrendatario(Long id, String nombre, String apellido, String cedula, String nacionalidad, String estadoCivil, String correo) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.nacionalidad = nacionalidad;
        this.estadoCivil = estadoCivil;
        this.correo = correo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public String toString() {
        return "Arrendatario{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", cedula='" + cedula + '\'' +
                ", nacionalidad='" + nacionalidad + '\'' +
                ", estadoCivil='" + estadoCivil + '\'' +
                ", correo='" + correo + '\'' +
                '}';
    }
}
