package io.pleaze.sample.team.application.service;

import io.pleaze.sample.common.UseCase;
import io.pleaze.sample.team.application.port.in.InquireTeamUseCase;
import io.pleaze.sample.team.domain.Team;
import io.pleaze.sample.team.domain.Team.TeamId;
import io.pleaze.sample.team.domain.Team.TeamName;
import lombok.RequiredArgsConstructor;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@UseCase
@Transactional
class InquireTeamService implements InquireTeamUseCase {

  @Override
  public Team inquireTeam(TeamId teamId) {
    return null;
  }

  @Override
  public TeamName inquireTeamName(TeamId teamId) {
    return null;
  }
}
