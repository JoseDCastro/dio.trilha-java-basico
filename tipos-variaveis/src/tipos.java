// Os oito tipos primitivos em Java são:
// boolean, byte, char, short, int, long, float e double. - esses tipos não são considerados objetos, e portanto representam valores brutos.
// Os tipos primitivos são usados para armazenar valores simples, como números, caracteres
// e lógicos. Eles são usados para armazenar valores simples, como números  
// e caracteres, e são usados para armazenar valores simples, como números e caracteres.
// Eles são armazenados diretamente na pilha de memória.(Memory stack)

// o tipo float é preciso colocar o F no final, pode ser maiúsculo ou minúsculo
// o tipo long coloca-se o L no final

public class tipos {
    public static void main(String[] args) throws Exception {
        double salarioMinimo = 2500;

        short numeroCurto = 1;
        // o short é um tipo de dado que armazena valores inteiros de 16
        int numeroNormal = numeroCurto;
        // o int é um tipo de dado que armazena valores inteiros de 32
        short numeroCurto2 = (short) numeroNormal; // um short nesse caso não aceitaria receber o úmero normal devido a ser um int que comporta mais do que um short 
        // poderia comportar,sendo assim precisamos especificar que o valor não receberá mais do que o que o short suportaria.Caso contrário apresentaria um erro.
    }

// Variáveis e constantes

// As Constantes devem sempre ser declaradas em CAIXA ALTA
// As constantes são valores que não podem ser alterados durante a execução do programa.

    public static void varConst(String[] args) {
        final double VALOR_DE_PI = 3.14;  // devido a termos Final antecipando o método double, não é permitido que haja alteração em seu  valor 

        //VALOR_DE_PI = 10.75;  // por isso ele demonstra o err na variável, pelo valor não corresponder a mesma
    }

}



