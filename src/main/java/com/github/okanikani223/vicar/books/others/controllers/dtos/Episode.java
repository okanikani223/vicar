package com.github.okanikani223.vicar.books.others.controllers.dtos;

import io.swagger.v3.oas.annotations.media.Schema;

import java.time.OffsetDateTime;
import java.util.Objects;

public record Episode(
        @Schema(description = "Episode Number", minimum = "0")
        int episodeNumber,
        @Schema(description = "Episode Title")
        String title,
        @Schema(description = "URL of the episode")
        String url,
        @Schema(description = "Time the episode was updated", example = "2023-10-22T15:01:00+09:00")
        OffsetDateTime atUpdate
) {
    public Episode {
        if (episodeNumber < 0) throw new IllegalArgumentException("");
        if (Objects.isNull(title) || title.isBlank()) throw new IllegalArgumentException("");
        if (Objects.isNull(url) || url.isBlank()) throw new IllegalArgumentException("");
        if (Objects.isNull(atUpdate)) throw new IllegalArgumentException("");
    }
}
