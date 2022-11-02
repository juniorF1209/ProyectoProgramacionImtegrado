
package Modelo;

public class Registro_Atencion {
    private char id_registro;
    private String fecha_registro;
    private String diagnostico_primario;
    private String diagnostico_final;
    private char id_paciente;
    private char id_medico;

    public Registro_Atencion() {
    }

    public Registro_Atencion(char id_registro, String fecha_registro, String diagnostico_primario, String diagnostico_final, char id_paciente, char id_medico) {
        this.id_registro = id_registro;
        this.fecha_registro = fecha_registro;
        this.diagnostico_primario = diagnostico_primario;
        this.diagnostico_final = diagnostico_final;
        this.id_paciente = id_paciente;
        this.id_medico = id_medico;
    }

    public char getId_registro() {
        return id_registro;
    }

    public void setId_registro(char id_registro) {
        this.id_registro = id_registro;
    }

    public String getFecha_registro() {
        return fecha_registro;
    }

    public void setFecha_registro(String fecha_registro) {
        this.fecha_registro = fecha_registro;
    }

    public String getDiagnostico_primario() {
        return diagnostico_primario;
    }

    public void setDiagnostico_primario(String diagnostico_primario) {
        this.diagnostico_primario = diagnostico_primario;
    }

    public String getDiagnostico_final() {
        return diagnostico_final;
    }

    public void setDiagnostico_final(String diagnostico_final) {
        this.diagnostico_final = diagnostico_final;
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
