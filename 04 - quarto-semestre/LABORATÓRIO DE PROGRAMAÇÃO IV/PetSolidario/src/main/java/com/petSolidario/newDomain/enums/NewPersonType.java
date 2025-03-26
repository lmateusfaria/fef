package com.petSolidario.newDomain.enums;

public enum NewPersonType {

    ADMIN(0,"ROLE_ADMIN"),USER(1,"ROLE_USER"),INSTITUICAO(2,"ROLE_INSTITUICAO");

    private Integer id;
    private String personType ;

    NewPersonType(Integer id, String personType) {
        this.id = id;
        this.personType = personType;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPersonType() {
        return personType;
    }

    public void setPersonType(String personType) {
        this.personType = personType;
    }

    public static NewPersonType toEnum(String id) {
        if (id == null) return null;
        for (NewPersonType x : NewPersonType.values()) {
            if (id.equals(x.getId())) {
                return x;
            }
        }
        throw new IllegalArgumentException("Perfil Inválido!");
    }

}
