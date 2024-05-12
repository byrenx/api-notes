package com.byrenx.apinotes.entities;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import jakarta.annotation.Nonnull;

@RequiredArgsConstructor
@Setter
@Getter
public class Note {
    private Long id;
    @Nonnull
    private String title;
    @Nonnull
    private String body;
}
