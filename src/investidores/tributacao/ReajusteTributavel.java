package investidores.tributacao;

import java.math.BigDecimal;

public interface ReajusteTributavel extends investidores.tributacao.Reajuste {

    BigDecimal valorImpostoDeRenda();
}
