package com.lfw.boot.core.event;

import com.lfw.boot.core.entity.UserEntity;
import org.springframework.context.ApplicationEvent;

/**
 * 登录成功事件。所有事件都推荐继承 ApplicationEvent
 */
public class LoginSuccessEvent extends ApplicationEvent {

    /**
     * @param source  代表是谁登录成了
     */
    public LoginSuccessEvent(UserEntity source) {
        super(source);
    }

}
