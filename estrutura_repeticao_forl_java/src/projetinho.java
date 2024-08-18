import java.util.Locale;

public class projetinho {
    public static void main(String[] args){
     String nome = "Maria";
     int idade = 31;
     double altura = 1.70;
     double peso = 60.02;
     double renda = 4000.0;
     System.out.printf("%s tem %d anos, tem %.2f de altura, pesa %.2fkgs e ganha R$ %.2f reais %n", nome, idade, altura, peso, renda);
     // "%s" é a marcação onde entra os dados da varável do tipo string, nesse caso é a váriavel "nome".
     // "%d" é a marcação onde entra os dados da variável do tipo int, nesse caso é a variável "idade".
     // "%f" é a marcação para dados flutuantes, eu coloquei "%.2f" porque quero que o dado saia com apenas duas casas decimais, no meu caso são três variáveis, a de "altura", "peso" e "renda"
     // "%n" serve para quebrar a linha, não marca nenhuma entrada de dados
     Locale.setDefault(Locale.US);
    }
}
