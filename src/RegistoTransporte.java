import java.util.Date;

public class RegistoTransporte {


	int id;
    Date dataExp;
    
    
    public RegistoTransporte(int id,Date dataExp){
    
    this.id=id;
    this.dataExp=dataExp;
    
 
    }

    public int getId(){
    
    return id;
    }
    
    public void setId(int id){
    
    this.id=id;
    
    }
    
    public Date getData(){
    
    return dataExp;
    
    }
    
    public void setData(Date dataExp){
    
    this.dataExp=dataExp;
    
    }


  }

