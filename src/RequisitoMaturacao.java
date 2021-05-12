public class RequisitoMaturacao {
    int id;
    int nivelMaximoMaturacao;
    int nivelMinimoMaturacao;
    Produtor produtor;
    Produto produto;

    public RequisitoMaturacao(int id, int nivelMaximoMaturacao, int nivelMinimoMaturacao, Produtor produtor, Produto produto) {
        this.id = id;
        this.nivelMaximoMaturacao = nivelMaximoMaturacao;
        this.nivelMinimoMaturacao = nivelMinimoMaturacao;
        this.produtor = produtor;
        this.produto = produto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNivelMaximoMaturacao() {
        return nivelMaximoMaturacao;
    }

    public void setNivelMaximoMaturacao(int nivelMaximoMaturacao) {
        this.nivelMaximoMaturacao = nivelMaximoMaturacao;
    }

    public int getNivelMinimoMaturacao() {
        return nivelMinimoMaturacao;
    }

    public void setNivelMinimoMaturacao(int nivelMinimoMaturacao) {
        this.nivelMinimoMaturacao = nivelMinimoMaturacao;
    }

    public Produtor getProdutor() {
        return produtor;
    }

    public void setProdutor(Produtor produtor) {
        this.produtor = produtor;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }
}