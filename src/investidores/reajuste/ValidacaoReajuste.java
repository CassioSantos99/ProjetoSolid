package investidores.reajuste;

import investidores.model.Investidor;

import javax.xml.bind.ValidationException;
import java.math.BigDecimal;

public interface ValidacaoReajuste {

    void validar(Investidor investidor, BigDecimal ajuste) throws ValidationException;
}
