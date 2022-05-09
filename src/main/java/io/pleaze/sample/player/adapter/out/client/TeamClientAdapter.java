package io.pleaze.sample.player.adapter.out.client;

import io.pleaze.sample.common.Client;
import io.pleaze.sample.common.Client.Method;
import io.pleaze.sample.player.adapter.in.rest.InquirePlayerController;
import io.pleaze.sample.player.application.port.out.TeamClientPort;
import io.pleaze.sample.player.domain.PlayerTeam.TeamId;
import io.pleaze.sample.player.domain.PlayerTeam.TeamName;
import io.pleaze.sample.team.adapter.in.rest.InquireTeamController;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class TeamClientAdapter implements
    TeamClientPort {

  private final InquireTeamController inquireTeamController;

  @Client(method = Method.GET, url = "/api/v1/team/{teamId}/name")
  @Override
  public TeamName loadTeamName(TeamId teamId) {
    ResponseEntity<String> response = inquireTeamController.inquireTeamName(teamId.value());
    return new TeamName(response.getBody());
  }
}
