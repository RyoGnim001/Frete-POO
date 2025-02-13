
public class Principal {
    public static void main(String[] args){


        CadastroFrete allfrete = new CadastroFrete();

        Frete f1 = new FretePadrao(3, 3);
        Frete f2 = new FreteExpresso(3, 3, 1);
        Frete f3 = new FreteSuperExpresso(3, 3.00,2,30);

        allfrete.adicionarFretes(f1);
        allfrete.adicionarFretes(f2);
        allfrete.adicionarFretes(f3);

        allfrete.exibirTodos();
        System.out.println("-------");
        System.out.println(allfrete.valorTotal());


    }
}
