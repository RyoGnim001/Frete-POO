public class FretePadrao extends Frete implements Fretavel{

    public FretePadrao(double distancia, double valorKm){
        super(distancia,valorKm);

    }
    @Override
    public double calcularFrete(){
        return getDistancia() * getValorKm();
    }
}
