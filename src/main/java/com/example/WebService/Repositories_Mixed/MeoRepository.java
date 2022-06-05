package com.example.WebService.Repositories_Mixed;

import com.example.WebService.Entity_BLX.Meo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MeoRepository extends JpaRepository<Meo, Integer> {
}