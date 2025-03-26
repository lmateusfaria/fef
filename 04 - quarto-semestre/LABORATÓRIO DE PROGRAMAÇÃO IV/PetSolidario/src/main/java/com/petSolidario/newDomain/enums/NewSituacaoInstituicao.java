package com.petSolidario.newDomain.enums;

public enum NewSituacaoInstituicao {

    APROVADO(0,"APROVADO"),EMAPROVACAO(1,"EMAPROVACAO"),IRREGULAR(2,"IRREGULAR");

    private Integer id;
    private String situacao;

    NewSituacaoInstituicao() {
    }

    NewSituacaoInstituicao(Integer id, String situacao) {
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

    public static NewSituacaoInstituicao toEnum(Integer id) {
        if (id == null) return null;
        for (NewSituacaoInstituicao x : NewSituacaoInstituicao.values()) {
            if (id.equals(x.getId())) {
                return x;
            }
        }
        throw new IllegalArgumentException("Situação inválida!");
    }
}
