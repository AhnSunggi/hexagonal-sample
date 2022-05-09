package io.pleaze.sample.player.application.port.in;

import io.pleaze.sample.player.domain.Player;
import io.pleaze.sample.player.domain.Player.PlayerId;

public interface InquirePlayerUseCase {

  Player inquirePlayer(PlayerId playerId);
}
