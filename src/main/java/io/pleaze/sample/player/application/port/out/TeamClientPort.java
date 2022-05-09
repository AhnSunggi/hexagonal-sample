package io.pleaze.sample.player.application.port.out;

import io.pleaze.sample.player.domain.PlayerTeam.TeamId;
import io.pleaze.sample.player.domain.PlayerTeam.TeamName;

public interface TeamClientPort {
  TeamName loadTeamName(TeamId teamId);
}
