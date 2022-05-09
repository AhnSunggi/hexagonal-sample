package io.pleaze.sample.player.application.service;

import io.pleaze.sample.common.UseCase;
import io.pleaze.sample.player.application.port.in.RegisterPlayerUseCase;
import io.pleaze.sample.player.application.port.in.command.RegisterPlayerCommand;
import io.pleaze.sample.player.application.port.out.LoadPlayerPort;
import lombok.RequiredArgsConstructor;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@UseCase
@Transactional
class RegisterPlayerService implements RegisterPlayerUseCase {

  @Override
  public void registerPlayer(RegisterPlayerCommand command) {
  }
}
