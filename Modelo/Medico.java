
package Modelo;

public class Medico {
    private char id_medico;
    private String nom_medico;
    private String ape_medico;
    private char dni_medico;
    private int id_especialidad;
    private String nacimiento;
    private String domicilio;
    private int id_genero;
    private String fecha_ingreso;
    private char telefono;

    public Medico() {
    }

    public Medico(char id_medico, String nom_medico, String ape_medico, char dni_medico, int id_especialidad, String nacimiento, String domicilio, int id_genero, String fecha_ingreso, char telefono) {
        this.id_medico = id_medico;
        this.nom_medico = nom_medico;
        this.ape_medico = ape_medico;
        this.dni_medico = dni_medico;
        this.id_especialidad = id_especialidad;
        this.nacimiento = nacimiento;
        this.domicilio = domicilio;
        this.id_genero = id_genero;
        this.fecha_ingreso = fecha_ingreso;
        this.telefono = telefono;
    }

    public char getId_medico() {
        return id_medico;
    }

    public void setId_medico(char id_medico) {
        this.id_medico = id_medico;
    }

    public String getNom_medico() {
        return nom_medico;
    }

    public void setNom_medico(String nom_medico) {
        this.nom_medico = nom_medico;
    }

    public String getApe_medico() {
        return ape_medico;
    }

    public void setApe_medico(String ape_medico) {
        this.ape_medico = ape_medico;
    }

    public char getDni_medico() {
        return dni_medico;
    }

    public void setDni_medico(char dni_medico) {
        this.dni_medico = dni_medico;
    }

    public int getId_especialidad() {
        return id_especialidad;
    }

    public void setId_especialidad(int id_especialidad) {
        this.id_especialidad = id_especialidad;
    }

    public String getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(String nacimiento) {
        this.nacimiento = nacimiento;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public int getId_genero() {
        return id_genero;
    }

    public void setId_genero(int id_genero) {
        this.id_genero = id_genero;
    }

    public String getFecha_ingreso() {
        return fecha_ingreso;
    }

    public void setFecha_ingreso(String fecha_ingreso) {
        this.fecha_ingreso = fecha_ingreso;
    }

    public char getTelefono() {
        return telefono;
    }

    public void setTelefono(char telefono) {
        this.telefono = telefono;
    }
    
    
}
