package investidores.reajuste;

import investidores.model.Investidor;

import javax.xml.bind.ValidationException;
import java.math.BigDecimal;
import java.util.List;

public class ReajusteGanhos {

    private List<ValidacaoReajuste> validacoes;

    public ReajusteGanhos(List<ValidacaoReajuste> validacoes) { this.validacoes = validacoes; }

    public void reajusteGanhosDoInvestidor(Investidor investidor, BigDecimal ajuste) {
        this.validacoes.forEach(v -> {
            try {
                v.validar(investidor, ajuste);
            } catch (ValidationException e) {
                e.printStackTrace();
            }
        });

        BigDecimal ganhoAjustado = investidor.getAporte().add(ajuste);
        investidor.atualizarAporte(ganhoAjustado);
    }
}
