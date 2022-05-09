package io.pleaze.sample.team.adapter.in.rest;

import io.pleaze.sample.common.ApiAdapter;
import io.pleaze.sample.team.application.port.in.InquireTeamUseCase;
import io.pleaze.sample.team.domain.Team.TeamId;
import io.pleaze.sample.team.domain.Team.TeamName;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@ApiAdapter
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/team")
public class InquireTeamController {

  private final InquireTeamUseCase inquireTeamUseCase;

  @GetMapping("{teamId}/name")
  public ResponseEntity<String> inquireTeamName(@RequestParam("teamId") Long teamId) {
    TeamName teamName = inquireTeamUseCase.inquireTeamName(new TeamId(teamId));
    return ResponseEntity
        .ok(teamName.value());
  }
}
