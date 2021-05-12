import java.util.Date;

public class ProgramacaoTransporte {


	int id;
    Date dataExpPrevista;
    
    
    public ProgramacaoTransporte(int id,Date dataExpPrevista){
    
    this.id=id;
    this.dataExpPrevista=dataExpPrevista;
    
 
    }

    public int getId(){
    
    return id;
    }
    
    public void setId(int id){
    
    this.id=id;
    
    }
    
    public Date getData(){
    
    return dataExpPrevista;
    
    }
    
    public void setData(Date dataExpPrevista){
    
    this.dataExp=dataExpPrevista;
    
    }


  }