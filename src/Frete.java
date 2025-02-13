abstract class Frete implements Fretavel{
    private double distancia;
    private double valorKm;

    public Frete(double distancia , double valorKm){
        this.distancia = distancia;
        this.valorKm = valorKm;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public double getValorKm() {
        return valorKm;
    }

    public void setValorKm(double valorKm) {
        this.valorKm = valorKm;
    }
}
