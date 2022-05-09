package io.pleaze.sample.player.adapter.out.persistence.repository;

import io.pleaze.sample.player.adapter.out.persistence.entity.PlayerJpaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerRepository extends JpaRepository<PlayerJpaEntity, Long> {

}
