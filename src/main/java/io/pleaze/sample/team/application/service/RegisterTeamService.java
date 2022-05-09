package io.pleaze.sample.team.application.service;

import io.pleaze.sample.common.UseCase;
import io.pleaze.sample.team.application.port.in.RegisterTeamUseCase;
import io.pleaze.sample.team.application.port.in.command.RegisterTeamCommand;
import lombok.RequiredArgsConstructor;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@UseCase
@Transactional
class RegisterTeamService implements RegisterTeamUseCase {

  @Override
  public void registerTeam(RegisterTeamCommand command) {

  }

}
