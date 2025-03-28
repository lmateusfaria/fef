package com.fef.locadora.Locadora.domains.enums;

public enum SituacaoVeiculo {

    DISPONIVEL(0,"DISPONIVEL"),ALUGADO(1,"ALUGADO"),MANUTENCAO(2,"MANUTENCAO");

    private Integer id;
    private String situacao;

    SituacaoVeiculo() {
    }

    SituacaoVeiculo(Integer id, String situacao) {
        this.id = id;
        this.situacao = situacao;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public static SituacaoVeiculo toEnum(Integer id) {
        if (id == null) return null;
        for (SituacaoVeiculo x : SituacaoVeiculo.values()) {
            if (id.equals(x.getId())) {
                return x;
            }
        }
        throw new IllegalArgumentException("Situação inválida!");
    }
}
