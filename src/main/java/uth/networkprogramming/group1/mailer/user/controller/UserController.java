package uth.networkprogramming.group1.mailer.user.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uth.networkprogramming.group1.mailer.common.constant.UrlConstant;
import uth.networkprogramming.group1.mailer.user.service.UserService;

@RestController
@RequestMapping(UrlConstant.USER_URL)
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }


}
