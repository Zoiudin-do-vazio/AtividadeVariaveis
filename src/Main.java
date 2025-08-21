//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int idade = 18;
        double alturaEmMetros = 1.81;
        String nome = "Pietro Gabriel Perondi";
        boolean estudante = true;
        int idade2 = 19;
        int idadeSoma = idade + idade2;
        double alturaMultiplicada = alturaEmMetros * 2;
        String saudacao = ("Olá Pietro");
        System.out.println(saudacao);
        System.out.println("Nome " + nome);
        System.out.println("Idade " + idade);
        System.out.println("Altura " + alturaEmMetros);
        System.out.println("É estudante ? " + estudante);
        System.out.println("Soma das idades " + idadeSoma);
        System.out.println("Altura Dobrada " + alturaMultiplicada);
    }
}