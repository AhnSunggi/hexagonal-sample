package io.pleaze.sample.team.application.port.out;

import io.pleaze.sample.team.domain.Team;
import io.pleaze.sample.team.domain.Team.TeamId;
import io.pleaze.sample.team.domain.Team.TeamName;

public interface LoadTeamPort {

  Team loadTeam(TeamId teamId);

  TeamName loadTeamName(TeamId teamId);
}
