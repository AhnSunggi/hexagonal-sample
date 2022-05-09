package io.pleaze.sample.player.adapter.in.rest;

import com.google.common.base.Preconditions;
import io.pleaze.sample.common.ApiAdapter;
import io.pleaze.sample.player.application.port.in.InquirePlayerUseCase;
import io.pleaze.sample.player.domain.Player.PlayerId;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@ApiAdapter
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/player")
public class InquirePlayerController {

  private final InquirePlayerUseCase inquirePlayerUseCase;

  @GetMapping("{playerId}")
  public ResponseEntity inquirePlayer(@RequestParam("playerId") Long playerId) {
    Preconditions.checkNotNull(playerId);
    inquirePlayerUseCase.inquirePlayer(new PlayerId(playerId));
    return ResponseEntity
        .ok()
        .build();
  }
}
