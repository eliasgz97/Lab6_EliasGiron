package lab6_eliasgiron;
import java.util.ArrayList;
public class Criaturas {
    private String nombrecriatura;
    private String cantidadenergia;
    private String cantidadanos;
    private String nombreregion;
    private String cantvivas;
    private ArrayList <String> objetosmagicos = new ArrayList();

    public Criaturas(String nombrecriatura, String cantidadenergia, String cantidadanos, String nombreregion, String cantvivas) {
        this.nombrecriatura = nombrecriatura;
        this.cantidadenergia = cantidadenergia;
        this.cantidadanos = cantidadanos;
        this.nombreregion = nombreregion;
        this.cantvivas = cantvivas;
    }

    public String getNombrecriatura() {
        return nombrecriatura;
    }

    public void setNombrecriatura(String nombrecriatura) {
        this.nombrecriatura = nombrecriatura;
    }

    public String getCantidadenergia() {
        return cantidadenergia;
    }

    public void setCantidadenergia(String cantidadenergia) {
        this.cantidadenergia = cantidadenergia;
    }

    public String getCantidadanos() {
        return cantidadanos;
    }

    public void setCantidadanos(String cantidadanos) {
        this.cantidadanos = cantidadanos;
    }

    public String getNombreregion() {
        return nombreregion;
    }

    public void setNombreregion(String nombreregion) {
        this.nombreregion = nombreregion;
    }

    public String getCantvivas() {
        return cantvivas;
    }

    public void setCantvivas(String cantvivas) {
        this.cantvivas = cantvivas;
    }

    public ArrayList<String> getObjetosmagicos() {
        return objetosmagicos;
    }

    public void setObjetosmagicos(ArrayList<String> objetosmagicos) {
        this.objetosmagicos = objetosmagicos;
    }

    @Override
    public String toString() {
        return nombrecriatura;
    }
    
}
