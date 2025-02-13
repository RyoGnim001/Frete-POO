import java.text.DecimalFormat;
import java.util.LinkedList;
import java.util.List;


public class CadastroFrete {

    private List<Fretavel> todosFretes = new LinkedList<Fretavel>();


    public void adicionarFretes(Fretavel frete){
        todosFretes.add(frete);
    }

    public void exibirTodos(){
        DecimalFormat df = new DecimalFormat("#.0");
        for (Fretavel frete : todosFretes){
            System.out.println("-------------------------");
            String infoEspecifica = frete.getInformacoesEspecificas();
            if (!infoEspecifica.isEmpty()) {
                System.out.println(infoEspecifica);
            }

            System.out.println("Distância: " + df.format(frete.getDistancia()) + " km " +
                    "Valor por km: " + df.format(frete.getValorKm()) + " R$ " + "Valor frete: " + df.format(frete.calcularFrete()));




        }
    }

    public String valorTotal(){
        double total = 0;
        for(Fretavel frete : todosFretes){
            total += frete.calcularFrete();
        }
        DecimalFormat df = new DecimalFormat("#.00");

        return "Total de todos os fretes: R$ " + df.format(total);
    }
}
