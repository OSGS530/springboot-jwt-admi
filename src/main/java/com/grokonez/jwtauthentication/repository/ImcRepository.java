package com.grokonez.jwtauthentication.repository;

import com.grokonez.jwtauthentication.model.Imc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ImcRepository extends JpaRepository<Imc, Long> {
}