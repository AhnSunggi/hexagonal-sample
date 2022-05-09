package io.pleaze.sample.player.application.port.out;


import io.pleaze.sample.player.domain.Player.PlayerId;
import io.pleaze.sample.player.domain.Player.PlayerName;

public interface SavePlayerPort {

  void savePlayer(PlayerId playerId, PlayerName playerName);
}
