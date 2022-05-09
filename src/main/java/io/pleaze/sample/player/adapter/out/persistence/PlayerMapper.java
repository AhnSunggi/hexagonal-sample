package io.pleaze.sample.player.adapter.out.persistence;

import io.pleaze.sample.player.adapter.out.persistence.entity.PlayerJpaEntity;
import io.pleaze.sample.player.domain.Player;
import io.pleaze.sample.player.domain.Player.PlayerId;
import io.pleaze.sample.player.domain.Player.PlayerName;
import io.pleaze.sample.player.domain.PlayerTeam.TeamId;
import org.springframework.stereotype.Component;

@Component
class PlayerMapper {

  Player mapToDomainEntity(PlayerJpaEntity player) {
    return Player.builder()
        .playerId(new PlayerId(player.getPlayerId()))
        .playerName(new PlayerName(player.getPlayerName()))
        .teamId(new TeamId(player.getTeamId()))
        .build();

  }

}
