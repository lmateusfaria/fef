package br.com.fef.pokemon.domains.enums;

public enum TipoPokemon {
    AGUA(0,"AGUA"),
    DRAGAO(1,"DRAGAO"),
    ELETRICO(2,"ELETRICO"),
    FADA(3,"FADA"),
    FASTASMA(4,"FASTASMA"),
    FOGO(5,"FOGO"),
    GELO(6,"GELO"),
    INSETO(7,"INSETO"),
    LUTADOR(8,"LUTADOR"),
    NORMAL(9,"NORMAL"),
    PEDRA(10,"PEDRA"),
    PLANTA(11,"PLANTA"),
    PSIQUICO(12,"PSIQUICO"),
    SOMBRIO(13,"SOMBRIO"),
    TERRESTRE(14,"TERRESTRE"),
    VENENOSO(15,"VENENOSO"),
    VOADOR(16,"VOADOR");


    private Integer id;
    private String tipoPokemon;

    TipoPokemon() {

    }

    TipoPokemon(Integer id, String tipoPokemon) {
        this.id = id;
        this.tipoPokemon = tipoPokemon;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String gettipoPokemon() {
        return tipoPokemon;
    }

    public void settipoPokemon(String tipoPokemon) {
        this.tipoPokemon = tipoPokemon;
    }

    public static TipoPokemon toEnum(Integer id) {
        if (id == null) return null;
        for (TipoPokemon x : TipoPokemon.values()) {
            if (id.equals(x.getId())) {
                return x;
            }
        }
        throw new IllegalArgumentException("Status inválido");
    }

}
