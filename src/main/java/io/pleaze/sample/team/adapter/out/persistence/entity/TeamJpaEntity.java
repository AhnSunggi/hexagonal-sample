package io.pleaze.sample.team.adapter.out.persistence.entity;

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
public class TeamJpaEntity {

  @Id
  @Column
  private Long teamId;

  private String teamName;

  @Builder
  public TeamJpaEntity(Long teamId, String teamName) {
    this.teamId = teamId;
    this.teamName = teamName;
  }
}
