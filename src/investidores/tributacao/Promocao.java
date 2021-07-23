package investidores.tributacao;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Promocao implements ReajusteTributavel {

    private BigDecimal valor;
    private LocalDate data;

    public Promocao(BigDecimal valor) {
        this.valor = valor;
        this.data = LocalDate.now();
    }

    public BigDecimal valor() { return valor; }

    public LocalDate data() { return data; }

    public BigDecimal valorImpostoDeRenda() { return valor.multiply(new BigDecimal("0.1"));}

}
