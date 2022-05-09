package io.pleaze.sample.team.adapter.out.persistence.repository;

import io.pleaze.sample.team.adapter.out.persistence.entity.TeamJpaEntity;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface TeamRepository extends JpaRepository<TeamJpaEntity, Long> {

  @Query("SELECT team.teamName FROM TeamJpaEntity team WHERE team.teamId = :teamId")
  Optional<String> findTeamNameByTeamId(@Param("teamId") Long teamId);
}
