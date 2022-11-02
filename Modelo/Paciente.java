
package Modelo;

import java.sql.Date;

public class Paciente {
    
    private String idpaciente;
    private String nompaciente;
    private int id_identificacion;
    private String num_documento;
    //private String nacimiento;
    private Date nacimiento;
    private int id_genero;
    private String domicilio;
    private String telefono;

    public Paciente() {
    }
    /*
    public Paciente(String idpaciente, String nompaciente, int id_identificacion, String num_documento, String nacimiento, int id_genero, String domicilio, String telefono) {
        this.idpaciente = idpaciente;
        this.nompaciente = nompaciente;
        this.id_identificacion = id_identificacion;
        this.num_documento = num_documento;
        this.nacimiento = nacimiento;
        this.id_genero = id_genero;
        this.domicilio = domicilio;
        this.telefono = telefono;
    }
    */
    public Paciente(String idpaciente, String nompaciente, int id_identificacion, String num_documento, Date nacimiento, int id_genero, String domicilio, String telefono) {
        this.idpaciente = idpaciente;
        this.nompaciente = nompaciente;
        this.id_identificacion = id_identificacion;
        this.num_documento = num_documento;
        this.nacimiento = nacimiento;
        this.id_genero = id_genero;
        this.domicilio = domicilio;
        this.telefono = telefono;
    }

    public String getIdpaciente() {
        return idpaciente;
    }

    public void setIdpaciente(String idpaciente) {
        this.idpaciente = idpaciente;
    }

    public String getNompaciente() {
        return nompaciente;
    }

    public void setNompaciente(String nompaciente) {
        this.nompaciente = nompaciente;
    }

    public int getId_identificacion() {
        return id_identificacion;
    }

    public void setId_identificacion(int id_identificacion) {
        this.id_identificacion = id_identificacion;
    }

    public String getNum_documento() {
        return num_documento;
    }

    public void setNum_documento(String num_documento) {
        this.num_documento = num_documento;
    }

    public Date getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(Date nacimiento) {
        this.nacimiento = nacimiento;
    }

    public int getId_genero() {
        return id_genero;
    }

    public void setId_genero(int id_genero) {
        this.id_genero = id_genero;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    
}
