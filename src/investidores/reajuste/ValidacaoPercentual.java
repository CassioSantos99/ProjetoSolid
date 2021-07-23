package investidores.reajuste;

import investidores.model.Investidor;

import javax.xml.bind.ValidationException;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class ValidacaoPercentual implements ValidacaoReajuste {

    public void validar(Investidor investidor, BigDecimal ajuste) throws ValidationException {
        BigDecimal aporteatual = investidor.getAporte();
        BigDecimal percentualAjuste = ajuste.divide(aporteatual, RoundingMode.HALF_UP);
        if (percentualAjuste.compareTo(new BigDecimal("0.4")) > 0) {
            throw  new ValidationException("Ajuste muito alto, você é um gênio!");
        }
    }

}
