package Desafios.Desafio3;
import java.util.Scanner;

public class Main {
    static void main() {


        //Entrada de Dados
        Scanner input = new Scanner(System.in);

        //Array e quantidade de ninjas
        Uchiha[] ninjas = new Uchiha[10];
        int num_ninjas = 1;
        int escolha = 0;

        //Ninja Sasuke, já existente
        Uchiha Sasuke = new Uchiha();
        Sasuke.nome = "Sasuke Uchiha";
        Sasuke.idade = 18;
        Sasuke.missao = "Escoltar o Hokage";
        Sasuke.nivelDificuldade = "A++";
        Sasuke.statusMissao = "Conclúida.";
        Sasuke.HabilidadeEspecial = "Rinnegan";
        ninjas[0] = Sasuke;

        while(escolha != 4) {

            System.out.println("--- Criador de Ninjas do clã Uchiha ---");
            System.out.println("1. Listar Ninjas");
            System.out.println("2. Adicionar");
            System.out.println("3. Atualizar habilidades especiais");
            System.out.println("4. Sair");
            System.out.print("Escolha: ");

            escolha = input.nextInt();

            System.out.println("===============");
            input.nextLine();

            switch (escolha) {
                case 1:
                    for (int i = 0; i < num_ninjas; i++) {
                        System.out.println("Ninja " + (i + 1) + " - ");
                        ninjas[i].mostrarInformacoes();
                    }

                    break;
                case 2:
                    if (num_ninjas < ninjas.length) {
                        System.out.print("Digite o nome do Ninja: ");
                        ninjas[num_ninjas] = new Uchiha();
                        ninjas[num_ninjas].nome = input.nextLine();

                        System.out.print("Digite a idade do Ninja: ");
                        ninjas[num_ninjas].idade = input.nextInt();
                        input.nextLine();

                        System.out.print("Digite a missão do Ninja: ");
                        ninjas[num_ninjas].missao = input.nextLine();

                        System.out.print("Digite a dificuldade da missão do Ninja: ");
                        ninjas[num_ninjas].nivelDificuldade = input.nextLine();

                        System.out.print("Digite o status da missão do Ninja: ");
                        ninjas[num_ninjas].statusMissao = input.nextLine();

                        System.out.print("Digite a habilidade especial do Ninja: ");
                        ninjas[num_ninjas].HabilidadeEspecial = input.nextLine();

                        num_ninjas++;
                    }
                    else {
                        System.out.println("Limite excedido!");
                    }
                    break;
                case 3:
                    System.out.println("Deseja mudar a habilidade de qual ninja? (Veja o número de cada um pela escolha de número 1) ");
                    int mudarhabilidade = input.nextInt();
                    input.nextLine();

                    if (mudarhabilidade >= 1 && mudarhabilidade <= num_ninjas) {

                    mudarhabilidade--;

                    System.out.println("Qual habilidade você quer adicionar no Ninja?");
                    ninjas[mudarhabilidade].HabilidadeEspecial = input.nextLine();

                }   else {
                    System.out.println("Ninja inválido!");
                }


                    break;
                case 4:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção Inválida!");
            }
        }
    }
    }