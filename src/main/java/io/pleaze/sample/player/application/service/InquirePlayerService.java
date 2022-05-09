package io.pleaze.sample.player.application.service;

import io.pleaze.sample.common.UseCase;
import io.pleaze.sample.player.application.port.in.InquirePlayerUseCase;
import io.pleaze.sample.player.application.port.out.LoadPlayerPort;
import io.pleaze.sample.player.application.port.out.TeamClientPort;
import io.pleaze.sample.player.domain.Player;
import io.pleaze.sample.player.domain.Player.PlayerId;
import io.pleaze.sample.player.domain.PlayerTeam.TeamName;
import lombok.RequiredArgsConstructor;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@UseCase
@Transactional
class InquirePlayerService implements InquirePlayerUseCase {

  private final LoadPlayerPort loadPlayerPort;
  private final TeamClientPort teamClientPort;

  @Override
  public Player inquirePlayer(PlayerId playerId) {

    Player player = loadPlayerPort.loadPlayer(playerId);
    TeamName teamName = teamClientPort.loadTeamName(player.teamId());
    player = player.builder()
        .teamName(teamName)
        .build();
    return player;
  }
}
