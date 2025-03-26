package com.petSolidario.newDomain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.petSolidario.newDomain.enums.NewPersonType;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

@Entity
@Table(name = "newPerson")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class NewPerson {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_person")
    protected Long id;

    @JsonFormat(pattern = "dd/MM/yyyy")
    protected LocalDate createAt = LocalDate.now();

    @ElementCollection(fetch = FetchType.EAGER)
    @CollectionTable(name = "person_type", joinColumns = @JoinColumn(name = "person_id"))
    protected Set<Integer> personType = new HashSet<>();

    public NewPerson() {
        addPersonType(NewPersonType.USER);
    }

    public NewPerson(Long id, LocalDate createAt, Set<Integer> personType) {
        this.id = id;
        this.createAt = createAt;
        this.personType = personType;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setPersonType(Set<Integer> personType) {
        this.personType = personType;
    }

    public LocalDate getCreateAt() {
        return createAt;
    }

    public void setCreateAt(LocalDate createAt) {
        this.createAt = createAt;
    }

    public Set<NewPersonType> getPersonType() {
        return personType == null ? Collections.emptySet() :
                personType.stream().map(id -> NewPersonType.toEnum(String.valueOf(id))).collect(Collectors.toSet());
    }

    public void setPersonType(NewPersonType newPersonType) {
        this.personType.add(newPersonType.getId());
    }

    public void addPersonType(NewPersonType newPersonType) {
        this.personType.add(newPersonType.getId());
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        NewPerson newPerson = (NewPerson) o;
        return Objects.equals(createAt, newPerson.createAt) && Objects.equals(personType, newPerson.personType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(createAt, personType);
    }
}
