/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListaSimples;

/**
 *
 * @author Davi
 */
public class Principal {

    public static void main(String[] args) {

        ListaSimples listaSupermercado = new ListaSimples();

        No prod1 = new No("Arroz", "Alimento", 11.45);
        No prod2 = new No("Feijão", "Alimento", 8.90);
        No prod3 = new No("Macarrão", "Alimento", 3.15);
        No prod4 = new No("TV", "Eletro-eletronico", 899);
        
        listaSupermercado.InserirNoFinal(prod1);
        listaSupermercado.InserirNoFinal(prod2);
        listaSupermercado.InserirNoFinal(prod3);
        listaSupermercado.InserirNoFinal(prod4);
        
        listaSupermercado.imprimirLista();
        
        listaSupermercado.valorFinalCompra();
        
        listaSupermercado.verificaItemLista("Macarrão");
        
        listaSupermercado.maiorValorItemLista();

    }

}
