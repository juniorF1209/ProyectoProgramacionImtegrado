
package Modelo;

public class Registro_Cita {
    private char id_cita;
    private String fecha_cita;
    private int id_estado;
    private String observaciones;
    private char id_paciente;
    private char id_medico;

    public Registro_Cita() {
    }

    public Registro_Cita(char id_cita, String fecha_cita, int id_estado, String observaciones, char id_paciente, char id_medico) {
        this.id_cita = id_cita;
        this.fecha_cita = fecha_cita;
        this.id_estado = id_estado;
        this.observaciones = observaciones;
        this.id_paciente = id_paciente;
        this.id_medico = id_medico;
    }

    public char getId_cita() {
        return id_cita;
    }

    public void setId_cita(char id_cita) {
        this.id_cita = id_cita;
    }

    public String getFecha_cita() {
        return fecha_cita;
    }

    public void setFecha_cita(String fecha_cita) {
        this.fecha_cita = fecha_cita;
    }

    public int getId_estado() {
        return id_estado;
    }

    public void setId_estado(int id_estado) {
        this.id_estado = id_estado;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public char getId_paciente() {
        return id_paciente;
    }

    public void setId_paciente(char id_paciente) {
        this.id_paciente = id_paciente;
    }

    public char getId_medico() {
        return id_medico;
    }

    public void setId_medico(char id_medico) {
        this.id_medico = id_medico;
    }
    
    
}
