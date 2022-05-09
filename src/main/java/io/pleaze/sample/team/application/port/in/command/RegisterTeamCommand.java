package io.pleaze.sample.team.application.port.in.command;

import com.google.common.base.Preconditions;
import io.pleaze.sample.team.domain.Team.TeamId;
import io.pleaze.sample.team.domain.Team.TeamName;
import lombok.Builder;
import lombok.Getter;

public record RegisterTeamCommand(
    @Getter TeamId teamId,
    @Getter TeamName teamName
) {

  @Builder
  public RegisterTeamCommand {
    Preconditions.checkNotNull(teamId, "teamId must not null");
    Preconditions.checkNotNull(teamName, "teamName must not null");
  }

}
