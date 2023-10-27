package com.github.okanikani223.vicar.share.applications.usecases;

public interface UseCase<I, O> {
    O handle(I input);
}
