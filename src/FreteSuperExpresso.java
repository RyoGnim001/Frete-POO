public class FreteSuperExpresso extends FreteExpresso implements  Fretavel{
    private double valorSeguro;

    public FreteSuperExpresso(double distancia, double valorKm,int nivelUrgencia, double valorSeguro){
        super(distancia, valorKm, nivelUrgencia);
        this.valorSeguro = valorSeguro;


    }

    @Override
    public double calcularFrete(){
        return (getDistancia() * getValorKm()) + (getNivelUrgencia() * 80) + getValorSeguro();
    }
    @Override
    public String getInformacoesEspecificas() {
        return "Nivel de urgência: " + getNivelUrgencia() + " Valor seguro: " + valorSeguro;
    }

    public double getValorSeguro() {
        return valorSeguro;
    }

    public void setValorSeguro(double valorSeguro) {
        this.valorSeguro = valorSeguro;
    }
}
