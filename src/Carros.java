public class Carros {
    public String Marca;
    public String Modelo;
    public double Custo;
    public Carros(){}
    public Carros(String marca,String modelo,double custo){
        this.Marca=marca;
        this.Modelo=modelo;
        this.Custo=custo;
    }
    public void setMarca(String marca){
        this.Marca=marca;
    }
    public void setModelo(String modelo){
        this.Modelo=modelo;
    }
    public void setCusto(double custo){
        this.Custo=custo;
    }
    public String getMarca(){
        return this.Marca;
    }
    public String getModelo(){
        return this.Modelo;
    }
    public double getCusto(){
        return this.Custo;
    }
    public String ToString(){
        return ("Marca: " + Marca + ", Modelo: " + Modelo + ", Custo: " + Custo);
    }
}
