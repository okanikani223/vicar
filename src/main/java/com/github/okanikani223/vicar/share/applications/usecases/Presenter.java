package com.github.okanikani223.vicar.share.applications.usecases;

public interface Presenter<I, O> {
    O complete(I input);
}
