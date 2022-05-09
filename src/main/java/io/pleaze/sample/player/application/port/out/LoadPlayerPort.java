package io.pleaze.sample.player.application.port.out;

import io.pleaze.sample.player.domain.Player;
import io.pleaze.sample.player.domain.Player.PlayerId;

public interface LoadPlayerPort {

  Player loadPlayer(PlayerId playerId);
}
