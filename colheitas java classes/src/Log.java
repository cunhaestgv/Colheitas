public class Log {

    int id;

    String tipoDeErro;

    Pedido pedido;

    Controlador controlador;


    public Log(int id, String tipoDeErro, Pedido pedido, Controlador controlador) {
        this.id = id;
        this.tipoDeErro = tipoDeErro;
        this.pedido = pedido;
        this.controlador = controlador;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipoDeErro() {
        return tipoDeErro;
    }

    public void setTipoDeErro(String tipoDeErro) {
        this.tipoDeErro = tipoDeErro;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public Controlador getControlador() {
        return controlador;
    }

    public void setControlador(Controlador controlador) {
        this.controlador = controlador;
    }
    
}
