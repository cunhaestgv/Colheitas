import java.util.ArrayList;

public class Controlador {

    int id;

    String estadoControlador;

    ArrayList<Sensor> sensor;

    public Controlador(int id, String estadoControlador, ArrayList<Sensor> sensor) {
        this.id = id;
        this.estadoControlador = estadoControlador;
        this.sensor = sensor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEstadoControlador() {
        return estadoControlador;
    }

    public void setEstadoControlador(String estadoControlador) {
        this.estadoControlador = estadoControlador;
    }

    public ArrayList<Sensor> getSensor() {
        return sensor;
    }

    public void setSensor(ArrayList<Sensor> sensor) {
        this.sensor = sensor;
    }
}
