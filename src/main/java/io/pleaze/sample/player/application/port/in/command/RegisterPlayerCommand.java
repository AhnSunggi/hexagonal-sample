package io.pleaze.sample.player.application.port.in.command;

import com.google.common.base.Preconditions;
import io.pleaze.sample.player.domain.Player.PlayerId;
import io.pleaze.sample.player.domain.Player.PlayerName;
import io.pleaze.sample.player.domain.PlayerTeam;
import lombok.Builder;
import lombok.Getter;

public record RegisterPlayerCommand(
    @Getter PlayerId playerId,
    @Getter PlayerName playerName,
    @Getter PlayerTeam.TeamId teamId
) {

  @Builder
  public RegisterPlayerCommand {
    Preconditions.checkNotNull(playerId, "playerId must not null");
    Preconditions.checkNotNull(playerName, "playerName must not null");
  }

}
