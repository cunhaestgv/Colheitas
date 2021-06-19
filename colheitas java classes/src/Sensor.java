public class Sensor {

    int id;

    String estadoDoSensor;

    public Sensor(int id, String estadoDoSensor) {
        this.id = id;
        this.estadoDoSensor = estadoDoSensor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEstadoDoSensor() {
        return estadoDoSensor;
    }

    public void setEstadoDoSensor(String estadoDoSensor) {
        this.estadoDoSensor = estadoDoSensor;
    }
}
