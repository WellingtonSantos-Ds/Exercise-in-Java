public class def {
  public static void main(String[]args){
    carro obj = new carro();
    obj.modelo = "bmw x1";
    obj.placa = "bha 123";
    obj.portas = 4;
    obj. mostrar();
      
  }
  
}

class carro{
  public int portas;
  public String placa;
  public String modelo;
    public void mostrar(){
      System.out.println("Modelo: "  +modelo);
      System.out.println(" Portas: "  +portas);
      System.out.println(" Placa: " +placa);
    }
 }