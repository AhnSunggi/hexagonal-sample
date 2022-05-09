package io.pleaze.sample.team.application.port.in;

import io.pleaze.sample.team.domain.Team;
import io.pleaze.sample.team.domain.Team.TeamName;

public interface InquireTeamUseCase {

  Team inquireTeam(Team.TeamId teamId);

  TeamName inquireTeamName(Team.TeamId teamId);

}
