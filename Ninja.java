package Desafios.Desafio3;

public class Ninja {

    String nome;
    String missao;
    String nivelDificuldade;
    String statusMissao;
    int idade;

    public void mostrarInformacoes(){
        System.out.println("---- INFOS DO NINJA ----");
         System.out.println("Nome do Ninja: " + nome);
         System.out.println("Idade: " + idade);
         System.out.println("Missão: " + missao);
         System.out.println("Nivel de dificuldade: " + nivelDificuldade);
         System.out.println("Status da missão:  " + statusMissao);
        System.out.println("---------------");
    }

}
