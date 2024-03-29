package ru.itis.chat.servies;

import org.springframework.security.core.Authentication;
import ru.itis.chat.forms.UserForm;
import ru.itis.chat.model.User;

public interface SignUpService {
    void signUp(UserForm userForm);
    User getCurrentUser(Authentication authentication);
}
