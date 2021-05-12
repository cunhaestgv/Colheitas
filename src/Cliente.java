public class Cliente {

    int id;
    String nome;
    String morada;
    String contacto;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMorada() {
        return morada;
    }

    public void setMorada(String morada) {
        this.morada = morada;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public Cliente(int id, String nome, String morada, String contacto) throws Exception {
        if(id <1) throw new Exception("Id menor que 1");
        if(nome.length() <3 || nome.length()>50) throw new Exception("Nome tem de ter 3 carateres");

        this.id = id;
        this.nome = nome;
        this.morada = morada;
        this.contacto = contacto;
    }



}
