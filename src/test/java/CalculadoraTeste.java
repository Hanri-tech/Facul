import org.junit.Assert;
import org.junit.Test;

public class CalculadoraTeste {
    @Test
    public void somaCalculoTeste(){
        final int resultado = Calculadora.soma(2, 3);
        final int resultadoEsperado = 5;

        Assert.assertEquals(resultadoEsperado, resultado, 0);
    }

    @Test
    public void somaAbsCalculoTeste(){
        final int resultado = Calculadora.somaAbs(-3, -2);
        final int resultadoEsperado = 5;

        Assert.assertEquals(resultadoEsperado, resultado, 0);
    }

    @Test
    public void somaPonteciaCalculoTeste(){
        final int resultado = Calculadora.somaPontecia(3, 3);
        final int resultadoEsperado = 27;

        Assert.assertEquals(resultadoEsperado, resultado, 0);
    }
}