package com.rubok.docker.biz.repository;

import com.rubok.docker.biz.entity.Fassto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FasstoRepository extends JpaRepository<Fassto, Long> {
    List<Fassto> findFasstosByUseYnTrue();
    Fassto findByFasstoSeq(Long fasstoSeq);
}
