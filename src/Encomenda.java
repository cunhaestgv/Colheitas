import java.util.Date;

public class Encomenda {


	int id;
    Date data;
    String morada;
    String estado;
    
    
    public Encomenda(int id,Date data,String morada,String estado){
    
    this.id=id;
    this.data=data;
    this.morada=morada;
    this.estado=estado;
    
 
    }

    public int getId(){
    
    return id;
    }
    
    public void setId(int id){
    
    this.id=id;
    
    }
    
    public Date getData(){
    
    return data;
    
    }
    
    public void setData(Date data){
    
    this.data=data;
    
    }
    
    
    public String getMorada() {
    
    return morada;
    
    }
    
    public void setMorada(String morada){
    
    this.morada=morada;
    
    
    }

    public String getEstado() {
    
    return estado;
    
    }
    
    public void setEstado(String estado){
    
    this.estado=estado;
    
    
    }


  }
