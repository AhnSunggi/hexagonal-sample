package io.pleaze.sample.team.adapter.in.rest;

import io.pleaze.sample.common.ApiAdapter;
import io.pleaze.sample.team.application.port.in.RegisterTeamUseCase;
import io.pleaze.sample.team.application.port.in.command.RegisterTeamCommand;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@ApiAdapter
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/team")
public class RegisterTeamController {

  private final RegisterTeamUseCase registerTeamUseCase;

  @PostMapping("")
  public ResponseEntity registerTeam(@RequestBody RegisterTeamCommand command) {
    registerTeamUseCase.registerTeam(command);
    return ResponseEntity
        .ok()
        .build();
  }


}
