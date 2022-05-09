package io.pleaze.sample.player.adapter.out.persistence.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "player")
@Entity
@Getter
@NoArgsConstructor
public class PlayerJpaEntity {

  @Id
  @Column
  private Long playerId;

  @Column
  private String playerName;

  @Column
  private Long teamId;

  @Builder
  public PlayerJpaEntity(
      Long playerId,
      String playerName,
      Long teamId) {
    this.playerId = playerId;
    this.playerName = playerName;
    this.teamId = teamId;
  }
}
