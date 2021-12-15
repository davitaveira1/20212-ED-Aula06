package ListaSimples;

public class ListaSimples {

    No primeiro, ultimo;

    public ListaSimples() {

        primeiro = ultimo = null;

    }

    public void InserirNoFinal(No novoNo) {

        if (primeiro == null) {
            primeiro = novoNo;
            ultimo = novoNo;
        } else {
            ultimo.prox = novoNo;
            ultimo = novoNo;
        }

    }

    public void imprimirLista() {

        if (primeiro == null) {
            System.out.println("Lista vazia!");
        } else {

            No aux = primeiro;
            int pos = 1;

            while (aux != null) {

                System.out.println("Pos: " + pos + "\n\tNome: " + aux.nome + "\n\tCategoria: " + aux.categoria + "\n\tPreço: " + aux.preco);
                aux = aux.prox;
                pos++;

            }

        }

    }

    public void valorFinalCompra() {

        if (primeiro == null) {
            System.out.println("Lista vazia!!");
        } else {

            No aux = primeiro;
            double soma = 0;
            while (aux != null) {
                soma = soma + aux.preco;
                aux = aux.prox;
            }
            System.out.println("\nValor final de compra: " + soma);

        }

    }

    public void verificaItemLista(String nomeItem) {

        if (primeiro == null) {
            System.out.println("Lista vazia!!");
        } else {

            No aux = primeiro;
            int pos = 1;
            int flag = 0;
            while (aux != null) {

                if (aux.nome.equals(nomeItem)) {
                    System.out.println("\nItem encontrado! Pos: " + pos);
                    flag=1;
                }
                aux = aux.prox;
                pos++;
            }
            
            if(flag==0){
                System.out.println("\nItem não foi encontrado!");
            }

        }

    }

}
