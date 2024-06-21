package com.dictionaryapp.validation;

import com.dictionaryapp.service.WordService;
import com.dictionaryapp.validation.annotation.UniquePerformer;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;


public class UniquePerformerValidator implements ConstraintValidator<UniquePerformer, String> {

    private final WordService songService;

    public UniquePerformerValidator(WordService songService) {
        this.songService = songService;
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        return false;
    }
}
