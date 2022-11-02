
package Modelo;

public class Tipo_Identificacion {
    private int tip_identificacion;
    private String nom_identificacion;

    public Tipo_Identificacion(int tip_identificacion, String nom_identificacion) {
        this.tip_identificacion = tip_identificacion;
        this.nom_identificacion = nom_identificacion;
    }

    public Tipo_Identificacion() {
    }

    public int getTip_identificacion() {
        return tip_identificacion;
    }

    public void setTip_identificacion(int tip_identificacion) {
        this.tip_identificacion = tip_identificacion;
    }

    public String getNom_identificacion() {
        return nom_identificacion;
    }

    public void setNom_identificacion(String nom_identificacion) {
        this.nom_identificacion = nom_identificacion;
    }
    
    
}
