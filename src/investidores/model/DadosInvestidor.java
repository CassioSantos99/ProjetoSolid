package investidores.model;

import java.math.BigDecimal;

public class DadosInvestidor {

    private String nome;
    private String cpf;
    private Grau grau;
    private BigDecimal aporte;

    public DadosInvestidor(String nome, String cpf, Grau grau, BigDecimal aporte) {
        this.nome = nome;
        this.cpf = cpf;
        this.grau = grau;
        this.aporte = aporte;
    }

    public String getNome() { return nome; }

    public String getCpf() { return cpf; }

    public Grau getGrau() { return grau; }

    public void setGrau(Grau grau) { this.grau = grau; }

    public BigDecimal getAporte() { return aporte; }

    public void setAporte(BigDecimal aporte) { this.aporte = aporte; }
}

// "S" de S.O.L.I.D. pois cada classe tem uma única função,