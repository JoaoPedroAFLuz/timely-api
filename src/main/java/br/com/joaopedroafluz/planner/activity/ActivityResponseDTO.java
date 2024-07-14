package br.com.joaopedroafluz.planner.activity;

import java.time.LocalDateTime;
import java.util.UUID;

public record ActivityResponseDTO(UUID tripCode, UUID code, String title, LocalDateTime occursAt) {
}
