package com.github.okanikani223.vicar.books.applications.usecases;

import com.github.okanikani223.vicar.share.applications.usecases.Presenter;
import com.github.okanikani223.vicar.share.applications.usecases.UseCase;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class AddBookInteractor implements UseCase<AddBooksInfoUseCaseInputDto, AddBooksInfoUseCaseOutputDto> {
    private final Presenter<Object, AddBooksInfoUseCaseOutputDto> presenter;

    @Override
    public AddBooksInfoUseCaseOutputDto handle(AddBooksInfoUseCaseInputDto input) {
        return null;
    }
}
