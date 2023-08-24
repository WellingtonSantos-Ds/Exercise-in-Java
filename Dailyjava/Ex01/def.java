public class def {
  public static void main(String[]args){
    carro obj = new carro();
    obj.setmModelo("Bmw x1");
    obj.setPortas(2);
    obj.getmodelo();

   

      
  }
  
}

class carro{
  private int portas;
  private String placa;
  private String modelo;

  public int getPortas(){
    return portas;
  }
  public String getPaca(){
    return placa;
  }
  public String getmodelo(){
    return modelo;
  }

  public void setPortas(int portas){
    this.portas = portas;
  }
  public void setmModelo(String modelo){
    this.modelo = modelo;
  }
  public void setPortas(String placa){
    this.placa = placa;
  }

 }
