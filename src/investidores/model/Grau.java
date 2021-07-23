package investidores.model;

public enum Grau {

    CONSERVADOR {
        @Override
        public Grau getProximoGrau() { return MODERADO;}
    },
    MODERADO {
        @Override
        public Grau getProximoGrau() { return AGRESSIVO;}
    },
    AGRESSIVO {
        @Override
        public Grau getProximoGrau() { return AGRESSIVO;}
    };

    public abstract Grau getProximoGrau();
};

//  "D" de S.O.L.I.D. pois sem a abstração as implementações quebram.