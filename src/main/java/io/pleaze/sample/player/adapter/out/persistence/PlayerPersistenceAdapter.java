package io.pleaze.sample.player.adapter.out.persistence;

import io.pleaze.sample.common.JpaAdapter;
import io.pleaze.sample.player.adapter.out.persistence.entity.PlayerJpaEntity;
import io.pleaze.sample.player.adapter.out.persistence.repository.PlayerRepository;
import io.pleaze.sample.player.application.port.out.LoadPlayerPort;
import io.pleaze.sample.player.application.port.out.SavePlayerPort;
import io.pleaze.sample.player.domain.Player;
import io.pleaze.sample.player.domain.Player.PlayerId;
import io.pleaze.sample.player.domain.Player.PlayerName;
import javax.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;

@JpaAdapter
@RequiredArgsConstructor
public class PlayerPersistenceAdapter implements
    LoadPlayerPort,
    SavePlayerPort {

  private final PlayerRepository playerRepository;
  private final PlayerMapper playerMapper;

  @Override
  public Player loadPlayer(PlayerId playerId) {
    PlayerJpaEntity player = playerRepository.findById(playerId.value())
        .orElseThrow(EntityNotFoundException::new);
    return playerMapper.mapToDomainEntity(player);
  }

  @Override
  public void savePlayer(PlayerId playerId, PlayerName playerName) {

  }

}
