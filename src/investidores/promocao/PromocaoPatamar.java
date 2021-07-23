package investidores.promocao;

import investidores.model.Grau;
import investidores.model.Investidor;

import javax.xml.bind.ValidationException;

public class PromocaoPatamar {

    public void maisExp(Investidor investidor, boolean metaBatida) throws ValidationException {
        Grau grauAtual = investidor.getGrau();
        if (Grau.AGRESSIVO == grauAtual) {
            throw new ValidationException("Seu investimento já tem o risco máximo!");
        }

        if (metaBatida) {
            Grau novoGrau = grauAtual.getProximoGrau();
            investidor.promover(novoGrau);
        } else {
            throw new ValidationException("Você não está preparado para esse risco!");
        }
    }
}
