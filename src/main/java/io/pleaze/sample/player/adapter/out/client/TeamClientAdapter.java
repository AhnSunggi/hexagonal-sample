package io.pleaze.sample.player.adapter.out.client;

import io.pleaze.sample.common.Client;
import io.pleaze.sample.common.Client.Method;
import io.pleaze.sample.player.adapter.in.rest.InquirePlayerController;
import io.pleaze.sample.player.application.port.out.TeamClientPort;
import io.pleaze.sample.player.domain.PlayerTeam.TeamId;
import io.pleaze.sample.player.domain.PlayerTeam.TeamName;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;

@RequiredArgsConstructor
public class TeamClientAdapter implements
    TeamClientPort {

  private final InquirePlayerController inquirePlayerController;

  @Client(method = Method.GET, url = "/api/v1/team/{teamId}/name")
  @Override
  public TeamName loadTeamName(TeamId teamId) {
    ResponseEntity<String> response = inquirePlayerController.inquirePlayer(teamId.value());
    return new TeamName(response.getBody());
  }
}
