package Desafios.Desafio3;

public class Uchiha extends Ninja{

    String HabilidadeEspecial;

    public void mostrarHabilidade(){
        System.out.println("Habilidade especial: "+ HabilidadeEspecial);
    }

    public void mostrarInformacoes(){
        System.out.println("Nome do Ninja: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Missão: " + missao);
        System.out.println("Nivel de dificuldade: " + nivelDificuldade);
        System.out.println("Status da missão:  " + statusMissao);
        System.out.println("Habilidade especial: " + HabilidadeEspecial);
        System.out.println("----------");

    }
}
