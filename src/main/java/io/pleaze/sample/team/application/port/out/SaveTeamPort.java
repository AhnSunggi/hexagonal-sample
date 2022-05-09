package io.pleaze.sample.team.application.port.out;

import io.pleaze.sample.team.domain.Team.TeamId;
import io.pleaze.sample.team.domain.Team.TeamName;

public interface SaveTeamPort {

  void saveTeam(TeamId teamId, TeamName teamName);
}
