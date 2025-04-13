package br.com.fef.pokemon.domains.enums;

public enum NivelPokemon {
    INICIANTE(0,"INICIANTE)"),
    INTERMEDIARIO(1,"INTERMEDIARIO"),
    AVANCADO(2,"AVANCADO"),
    LENDARIO(3,"LENDARIO"),;

    private Integer id;
    private String nivelPokemon;

    NivelPokemon(Integer id, String nivelPokemon) {
        this.id = id;
        this.nivelPokemon = nivelPokemon;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNivelPokemon() {
        return nivelPokemon;
    }

    public void setNivelPokemon(String nivelPokemon) {
        this.nivelPokemon = nivelPokemon;
    }

    public static NivelPokemon toEnum(Integer id) {
        if (id == null) return null;
        for (NivelPokemon x : NivelPokemon.values()) {
            if (x.getId().equals(id)) {
                return x;
            }
        }
        throw new IllegalArgumentException("Nivel do Pokemon inválido!");
    }

}
