package io.pleaze.sample.player.domain;

import lombok.Builder;
import lombok.Getter;

public record PlayerTeam(
    @Getter TeamId teamId,
    @Getter TeamName teamName
) {

  @Builder
  public PlayerTeam {
  }

  public record TeamId(@Getter Long value) {

  }

  public record TeamName(@Getter String value) {

  }

}
