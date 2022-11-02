
package Modelo;

public class Especialidad {
    private int id_especialidad;
    private String nom_especialidad;

    public Especialidad(int id_especialidad, String nom_especialidad) {
        this.id_especialidad = id_especialidad;
        this.nom_especialidad = nom_especialidad;
    }

    public Especialidad() {
    }

    public int getId_especialidad() {
        return id_especialidad;
    }

    public void setId_especialidad(int id_especialidad) {
        this.id_especialidad = id_especialidad;
    }

    public String getNom_especialidad() {
        return nom_especialidad;
    }

    public void setNom_especialidad(String nom_especialidad) {
        this.nom_especialidad = nom_especialidad;
    }
    
}
