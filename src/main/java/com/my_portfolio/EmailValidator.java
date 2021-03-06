package com.my_portfolio;

import org.springframework.stereotype.Component;

import java.util.function.Predicate;
import java.util.regex.Pattern;

@Component
public class EmailValidator implements Predicate<String> {

  public static final Predicate<String> IS_EMAIL_VALID =
          Pattern.compile("^(.+)@(.+)$", Pattern.CASE_INSENSITIVE).asPredicate();

  @Override
  public boolean test (String email) {
    return IS_EMAIL_VALID.test(email);
  }
}
