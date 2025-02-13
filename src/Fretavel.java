public interface Fretavel {

    public double calcularFrete();
    double getDistancia();
    double getValorKm();

    default String getInformacoesEspecificas() {
        return "";
    }
}
