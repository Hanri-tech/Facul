/**
 * Classe com metodos dos calculos, que representa a <b>Exercicio3a.Calculadora</b>.
 * @author Hanri
 * @since 2021
 * @version 0.01
 */
public class Calculadora {

    /**
     * @param n1 1° parametro para realizar o calculo
     * @param n2 2° parametro para realizar o calculo
     * @return realiza a soma dos numero passado no parametro, e retorna o valor calculado
     */
    public static int soma(int n1, int n2){
        return n1+n2;
    }

    /**
     * @param n1 1° parametro para realizar o calculo
     * @param n2 2° parametro para realizar o calculo
     * @return passa no parametro a soma do valor, e retorna o valor absoluto da soma
     */
    public static int somaAbs(int n1, int n2){
       int soma = soma(n1, n2);
        return Math.abs(soma);
    }

    /**
     * @param n1 1° parametro para realizar o calculo
     * @param n2 2° parametro para realizar o calculo
     * @return retorna o valor a pontencia do valor passando no parametro
     */
    public static int somaPontecia(int n1, int n2){
        return (int) Math.pow(n1, n2);
    }

}
