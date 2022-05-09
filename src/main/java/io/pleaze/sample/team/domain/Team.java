package io.pleaze.sample.team.domain;

import lombok.Builder;
import lombok.Getter;

public record Team(
    @Getter TeamId teamId,
    @Getter TeamName teamName
) {

  @Builder
  public Team {
  }

  public record TeamId(@Getter Long value) {

  }

  public record TeamName(@Getter String value) {

  }

}
