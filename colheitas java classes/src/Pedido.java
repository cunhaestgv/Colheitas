import java.util.ArrayList;
import java.util.Date;

public class Pedido {

    int id;

    Date data;

    ArrayList<Controlador> controlador;

    public Pedido(int id, Date data, ArrayList<Controlador> controlador) {
        this.id = id;
        this.data = data;
        this.controlador = controlador;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public ArrayList<Controlador> getControlador() {
        return controlador;
    }

    public void setControlador(ArrayList<Controlador> controlador) {
        this.controlador = controlador;
    }
}
