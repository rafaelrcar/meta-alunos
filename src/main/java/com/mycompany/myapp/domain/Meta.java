package com.mycompany.myapp.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import java.io.Serializable;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

/**
 * A Meta.
 */
@Entity
@Table(name = "meta")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@SuppressWarnings("common-java:DuplicatedBlocks")
public class Meta implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    @Column(name = "id")
    private Long id;

    @NotNull
    @Column(name = "linguagem", nullable = false)
    private Integer linguagem;

    @NotNull
    @Column(name = "humanas", nullable = false)
    private Integer humanas;

    @NotNull
    @Column(name = "natureza", nullable = false)
    private Integer natureza;

    @NotNull
    @Column(name = "matematica", nullable = false)
    private Integer matematica;

    @ManyToOne(fetch = FetchType.LAZY)
    @JsonIgnoreProperties(value = { "metas" }, allowSetters = true)
    private Aluno aluno;

    // jhipster-needle-entity-add-field - JHipster will add fields here

    public Long getId() {
        return this.id;
    }

    public Meta id(Long id) {
        this.setId(id);
        return this;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getLinguagem() {
        return this.linguagem;
    }

    public Meta linguagem(Integer linguagem) {
        this.setLinguagem(linguagem);
        return this;
    }

    public void setLinguagem(Integer linguagem) {
        this.linguagem = linguagem;
    }

    public Integer getHumanas() {
        return this.humanas;
    }

    public Meta humanas(Integer humanas) {
        this.setHumanas(humanas);
        return this;
    }

    public void setHumanas(Integer humanas) {
        this.humanas = humanas;
    }

    public Integer getNatureza() {
        return this.natureza;
    }

    public Meta natureza(Integer natureza) {
        this.setNatureza(natureza);
        return this;
    }

    public void setNatureza(Integer natureza) {
        this.natureza = natureza;
    }

    public Integer getMatematica() {
        return this.matematica;
    }

    public Meta matematica(Integer matematica) {
        this.setMatematica(matematica);
        return this;
    }

    public void setMatematica(Integer matematica) {
        this.matematica = matematica;
    }

    public Aluno getAluno() {
        return this.aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Meta aluno(Aluno aluno) {
        this.setAluno(aluno);
        return this;
    }

    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Meta)) {
            return false;
        }
        return getId() != null && getId().equals(((Meta) o).getId());
    }

    @Override
    public int hashCode() {
        // see https://vladmihalcea.com/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
        return getClass().hashCode();
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "Meta{" +
            "id=" + getId() +
            ", linguagem=" + getLinguagem() +
            ", humanas=" + getHumanas() +
            ", natureza=" + getNatureza() +
            ", matematica=" + getMatematica() +
            "}";
    }
}
