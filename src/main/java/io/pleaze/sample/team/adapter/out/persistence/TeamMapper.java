package io.pleaze.sample.team.adapter.out.persistence;

import io.pleaze.sample.player.domain.Player;
import io.pleaze.sample.player.domain.Player.PlayerId;
import io.pleaze.sample.player.domain.Player.PlayerName;
import io.pleaze.sample.team.adapter.out.persistence.entity.TeamJpaEntity;
import io.pleaze.sample.team.domain.Team;
import io.pleaze.sample.team.domain.Team.TeamId;
import io.pleaze.sample.team.domain.Team.TeamName;
import org.springframework.stereotype.Component;

@Component
public class TeamMapper {

  Team mapToDomainEntity(TeamJpaEntity team) {
    return Team.builder()
        .teamId(new TeamId(team.getTeamId()))
        .teamName(new TeamName(team.getTeamName()))
        .build();
  }

}
