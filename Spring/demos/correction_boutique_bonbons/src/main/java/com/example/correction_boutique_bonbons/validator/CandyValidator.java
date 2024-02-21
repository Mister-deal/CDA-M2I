package com.example.correction_boutique_bonbons.validator;

import com.example.correction_boutique_bonbons.entity.Candy;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

@Component("beforeCreateCandyValidator")
public class CandyValidator implements Validator {
    @Override
    public boolean supports(Class<?> clazz) {
        return Candy.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        Candy candy = (Candy) target;
        if(candy.getName() == null || candy.getName().isEmpty())
            errors.rejectValue("name", "error.name");
    }
}
