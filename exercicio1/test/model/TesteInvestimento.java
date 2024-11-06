



import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TesteInvestimento {

    @Test
    public void testeClassificarInvestidor(){

        Investimento investimento;

        investimento = new Investimento(1000,4,3);
        assertEquals(1120.00, investimento.);
        assertEquals("Pequeno investidor", investimento.classificarInvestidor(1000));





    }

}
