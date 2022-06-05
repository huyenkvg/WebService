package com.example.WebService.Repositories_Mixed;

import com.example.WebService.Entity_BLX.Loaide;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoaideRepository extends JpaRepository<Loaide, Integer> {
}