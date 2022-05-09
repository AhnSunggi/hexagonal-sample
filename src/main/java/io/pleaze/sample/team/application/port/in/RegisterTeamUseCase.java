package io.pleaze.sample.team.application.port.in;

import io.pleaze.sample.team.application.port.in.command.RegisterTeamCommand;

public interface RegisterTeamUseCase {

  void registerTeam(RegisterTeamCommand command);
}
