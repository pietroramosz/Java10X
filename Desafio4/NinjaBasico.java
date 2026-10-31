package Desafios.Desafio4;

public class NinjaBasico implements Ninja {

    String nome;
    int idade;
    String habilidade;
    tipoHabilidade tipoHabilidade;

    public NinjaBasico(String nome, int idade, String habilidade, tipoHabilidade tipoHabilidade) {
        this.nome = nome;
        this.idade = idade;
        this.habilidade = habilidade;
        this.tipoHabilidade = tipoHabilidade;

    }

    public void mostrarInformacoes() {
        System.out.println("Nome: " + nome + " | Idade: " + idade + " | Habilidade: " + habilidade + " | Tipo da habilidade: " + tipoHabilidade);
    }

    public void executarHabilidades() {
        System.out.println("Meu nome é " + nome + " e eu usei a minha habilidade que é " + habilidade + "!!");
    }
}
