package com.github.okanikani223.vicar.books.applications.usecases;

import java.util.List;

public record AddBooksInfoUseCaseInputDto(
        String title,
        String url,
        List<String> tags,
        List<String> authors
) {
}
