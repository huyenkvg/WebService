package com.example.WebService.Repositories_Mixed;

import com.example.WebService.Entity_BLX.Bodethi;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BodethiRepository extends JpaRepository<Bodethi, Integer> {

}