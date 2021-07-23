package investidores.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Investidor {

    private DadosInvestidor dadosInvestidor;
    private LocalDate dataUltimoIR;

    public Investidor(String nome, String cpf, Grau grau, BigDecimal aporte) {
        this.dadosInvestidor = new DadosInvestidor(nome, cpf, grau, aporte);
    }

    public void aumentaAporte(BigDecimal novoAporte) {
        this.dadosInvestidor.setAporte(novoAporte);
        this.dataUltimoIR = LocalDate.now();
    }

    public void promover(Grau novoGrau) { this.dadosInvestidor.setGrau(novoGrau);}

    public String getNome() { return dadosInvestidor.getNome();}

    public String getCpf() { return dadosInvestidor.getCpf();}

    public Grau getGrau() { return dadosInvestidor.getGrau();}

    public BigDecimal getAporte() { return dadosInvestidor.getAporte();}

    public LocalDate getDataUltimoIR() { return dataUltimoIR;}
}

//  "L" de S.O.L.I.D. pois essa classe não precisa herdar todas as informações da classe
//   DadosInvestidor, basta complementar.