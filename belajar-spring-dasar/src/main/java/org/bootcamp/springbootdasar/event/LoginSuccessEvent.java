package org.bootcamp.springbootdasar.event;

import lombok.Getter;
import org.bootcamp.springbootdasar.data.User;
import org.springframework.context.ApplicationEvent;

@Getter
public class LoginSuccessEvent extends ApplicationEvent {

    private final User user;

    public LoginSuccessEvent(User user) {
        super(user);
        this.user = user;
    }
}
