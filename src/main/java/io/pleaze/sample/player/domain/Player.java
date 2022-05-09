package io.pleaze.sample.player.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

public record Player(
    @Getter PlayerId playerId,
    @Getter PlayerName playerName,
    @Getter PlayerTeam.TeamId teamId,
    @Getter PlayerTeam.TeamName teamName
) {

  @Builder
  public Player {
  }

  public record PlayerId(@Getter Long value) {

  }

  public record PlayerName(@Getter String value) {

  }

}
