package Desafios.Desafio4;

public class NinjaAvancado implements Ninja {

    String nome;
    int idade;
    String habilidade;
    String especialidade;
    tipoHabilidade tipoHabilidade;

    public NinjaAvancado(String nome, int idade, String habilidade, String especialidade, tipoHabilidade tipoHabilidade) {
        this.nome = nome;
        this.idade = idade;
        this.habilidade = habilidade;
        this.especialidade = especialidade;
        this.tipoHabilidade = tipoHabilidade;
    }

    public void mostrarInformacoes() {
        System.out.println("Nome: " + nome + " | Idade: " + idade + " | Habilidade: " + habilidade + " | Especialidade: " + especialidade);
    }

    public void executarHabilidades() {
        System.out.println("Meu nome é " + nome + " e eu usei a minha habilidade que é " + habilidade + "!!");
    }
}
