package io.pleaze.sample.team.adapter.out.persistence;

import io.pleaze.sample.common.JpaAdapter;
import io.pleaze.sample.player.application.port.out.LoadPlayerPort;
import io.pleaze.sample.player.application.port.out.SavePlayerPort;
import io.pleaze.sample.player.domain.Player;
import io.pleaze.sample.player.domain.Player.PlayerId;
import io.pleaze.sample.player.domain.Player.PlayerName;
import io.pleaze.sample.team.adapter.out.persistence.repository.TeamRepository;
import io.pleaze.sample.team.application.port.out.LoadTeamPort;
import io.pleaze.sample.team.application.port.out.SaveTeamPort;
import io.pleaze.sample.team.domain.Team;
import io.pleaze.sample.team.domain.Team.TeamId;
import io.pleaze.sample.team.domain.Team.TeamName;
import javax.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;

@JpaAdapter
@RequiredArgsConstructor
public class TeamPersistenceAdapter implements
    LoadTeamPort,
    SaveTeamPort {

  private final TeamRepository teamRepository;

  @Override
  public Team loadTeam(TeamId teamId) {
    return null;
  }

  @Override
  public TeamName loadTeamName(TeamId teamId) {
    String teamName = teamRepository.findTeamNameByTeamId(teamId.value())
        .orElseThrow(EntityNotFoundException::new);
    return new TeamName(teamName);
  }

  @Override
  public void saveTeam(TeamId teamId, TeamName teamName) {

  }
}
