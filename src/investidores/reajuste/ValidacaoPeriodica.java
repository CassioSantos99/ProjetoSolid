package investidores.reajuste;

import investidores.model.Investidor;

import javax.xml.bind.ValidationException;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class ValidacaoPeriodica implements ValidacaoReajuste {

    public void validar(Investidor investidor, BigDecimal ajuste) throws ValidationException {
        LocalDate dataUltimoReajuste = investidor.getDataUltimoIR();
        LocalDate datAtual = LocalDate.now();
        long mesesDesdeUltimoReajuste = ChronoUnit.MONTHS.between(dataUltimoReajuste,
                datAtual);
        if (mesesDesdeUltimoReajuste < 6) {
            throw new ValidationException("Intervalo entre ajuste não atingiu o tempo minimo!");
        }
    }
}
