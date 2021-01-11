package com.grokonez.jwtauthentication.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "imc")
public class Imc{
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	private Date date;
    private Long user;
    private Double imc;
    private Integer age;
    private Double diabetes=0.0;
    private Double glucosa = 0.0;
    public Imc() {}

    public Imc(Long id, Date date, Long user, Double imc, Integer age, Double glucosa,Double diabetes) {
        this.id = id;
        this.date = date;
        this.user = user;
        this.imc = imc;
        this.age = age;
        this.glucosa = glucosa;
        this.diabetes=diabetes;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Long getUser() {
        return user;
    }

    public void setUser(Long user) {
        this.user = user;
    }

    public Double getDiabetes() {
        return diabetes;
    }

    public void setDiabetes(Double diabetes) {
        this.diabetes = diabetes;
    }

    public Double getImc() {
        return imc;
    }

    public void setImc(Double imc) {
        this.imc = imc;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Double getGlucosa() {
        return glucosa;
    }

    public void setGlucosa(Double glucosa) {
        this.glucosa = glucosa;
    }
}