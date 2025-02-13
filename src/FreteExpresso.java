public class FreteExpresso extends Frete implements Fretavel {
    private int nivelUrgencia;

    public FreteExpresso(double distancia, double valorKm, int nivelUrgencia){
        super(distancia,valorKm);
        this.nivelUrgencia = nivelUrgencia;
    }

    @Override
    public double calcularFrete(){
        return (getDistancia() * getValorKm() + (getNivelUrgencia() * 50)); //o nivel de urgencia adiciona 100 a cada nivel de 1 a 3
    }

    @Override
    public String getInformacoesEspecificas() {
        return "Nível de urgência: " + nivelUrgencia;
    }

    public int getNivelUrgencia() {
        return nivelUrgencia;
    }

    public void setNivelUrgencia(int nivelUrgencia) {
        this.nivelUrgencia = nivelUrgencia;
    }
}
