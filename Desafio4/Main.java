package Desafios.Desafio4;

public class Main {
    static void main() {

        NinjaBasico Boruto = new NinjaBasico("Boruto Uzumaki", 15, "ativar Jogan", tipoHabilidade.NINJUTSU);
        Boruto.mostrarInformacoes();
        Boruto.executarHabilidades();


        NinjaAvancado Naruto = new NinjaAvancado("Naruto Uzumaki", 34, "modo sábio", "chakara da Kurama.",  tipoHabilidade.NINJUTSU);
        Naruto.mostrarInformacoes();
        Naruto.executarHabilidades();
    }
}
