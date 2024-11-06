package model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TesteDiario {
    @Test
    public void testeSituacao(){


        Diario diario;

        diario = new Diario(1,50,5);
        assertEquals("REPROVADO", diario.situacao());
        diario = new Diario(2,50,10);
        assertEquals("REPROVADO", diario.situacao());
        diario = new Diario(3,50,6);
        assertEquals("REPROVADO", diario.situacao());
        diario = new Diario(4,60,5);
        assertEquals("REPROVADO", diario.situacao());
        diario = new Diario(5,60,10);
        assertEquals("REPROVADO", diario.situacao());
        diario = new Diario(6,60,6);
        assertEquals("REPROVADO", diario.situacao());
        diario = new Diario(7,10,5);
        assertEquals("REPROVADO", diario.situacao());
        diario = new Diario(8,10,10);
        assertEquals("REPROVADO", diario.situacao());
        diario = new Diario(9,10,6);
        assertEquals("REPROVADO", diario.situacao());

        diario = new Diario(1,74,5);
        assertEquals("REPROVADO", diario.situacao());
        diario = new Diario(2,75,6);
        assertEquals("APROVADO", diario.situacao());
        diario = new Diario(3,0,0);
        assertEquals("REPROVADO", diario.situacao());
        diario = new Diario(4,100,10);
        assertEquals("APROVADO", diario.situacao());

        diario = new Diario(1,75,4);
        assertEquals("RECUPERAÇÃO", diario.situacao());



    }

}
