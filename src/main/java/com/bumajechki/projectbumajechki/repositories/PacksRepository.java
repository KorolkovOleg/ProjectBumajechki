package com.bumajechki.projectbumajechki.repositories;

import com.bumajechki.projectbumajechki.domain.Pack;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PacksRepository extends JpaRepository<Pack, Long> {
}
