package io.pleaze.sample.player.application.port.in;

import io.pleaze.sample.player.application.port.in.command.RegisterPlayerCommand;

public interface RegisterPlayerUseCase {

  void registerPlayer(RegisterPlayerCommand command);
}
