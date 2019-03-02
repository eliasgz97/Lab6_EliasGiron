package lab6_eliasgiron;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class MundoDisco {

    private String nombretortuga;
    ArrayList<Criaturas> criaturas = new ArrayList();
    private File archivo = null;

    public MundoDisco(String path) {
        archivo = new File(path);
    }

    public MundoDisco() {

    }

    public String getNombre() {
        return nombretortuga;
    }

    public void setNombre(String nombretortuga) {
        this.nombretortuga = nombretortuga;
    }

    public ArrayList<Criaturas> getCriaturas() {
        return criaturas;
    }

    public void setCriaturas(ArrayList<Criaturas> criaturas) {
        this.criaturas = criaturas;
    }

    @Override
    public String toString() {
        return nombretortuga;
    }

    public void guardararchivo() {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo);
            bw = new BufferedWriter(fw);
            for (Criaturas t : criaturas) {
                bw.write(t.getNombrecriatura() + "|");
                bw.write(t.getCantidadenergia() + "|");
                bw.write(t.getCantidadanos() + "|");
                bw.write(t.getNombreregion() + "|");
                bw.write(t.getCantvivas() + "|");
                for (int i = 0; i < t.getObjetosmagicos().size(); i++) {
                    bw.write("-"+t.getObjetosmagicos().get(i));
                }
            }
            bw.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void abrirarchivo() {
        Scanner sc = null;
        Scanner sc2 = null;
        criaturas = new ArrayList();
        if (archivo.exists()) {
            try {
                sc = new Scanner(archivo);
                sc.useDelimiter("|");
                while (sc.hasNext()) {
                    String nombrecriatura = sc.next();
                    String cantidadenergia = sc.next();
                    String cantidadanos = sc.next();
                    String nombreregion = sc.next();
                    String cantvivas = sc.next();
                    System.out.println(cantvivas);
                    Criaturas c = new Criaturas(nombrecriatura, cantidadenergia, cantidadanos, nombreregion, cantvivas);
                    criaturas.add(c);
                    
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            sc.close();
        }
    }

}
