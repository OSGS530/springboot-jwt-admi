package com.grokonez.jwtauthentication.model;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.hibernate.annotations.NaturalId;




@Entity
@Table(name = "imc", uniqueConstraints = {
        
})
public class Imc{
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long iduser;
    private Double imc;

   
    public Imc() {}

    public Imc(Long iduser, Double imc) {
        this.iduser = iduser;
        this.imc = imc;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIduser() {
        return iduser;
    }

    public void setIiduser(Long iduser) {
        this.iduser = iduser;
    }

    public Double getImc() {
        return imc;
    }

    public void setImc(Double imc) {
        this.imc = imc;
    }

   
}