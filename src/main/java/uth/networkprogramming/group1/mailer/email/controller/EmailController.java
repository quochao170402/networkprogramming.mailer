package uth.networkprogramming.group1.mailer.email.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import uth.networkprogramming.group1.mailer.common.constant.UrlConstant;
import uth.networkprogramming.group1.mailer.common.helper.ResponseHelper;
import uth.networkprogramming.group1.mailer.email.model.Email;
import uth.networkprogramming.group1.mailer.email.service.EmailService;

import javax.validation.Valid;

@RestController
@RequestMapping(UrlConstant.EMAIL_URL)
public class EmailController {
    private final EmailService emailService;

    public EmailController(EmailService emailService) {
        this.emailService = emailService;
    }

    @PostMapping(consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public Object sendEmail(@ModelAttribute @Valid Email email) {
        return ResponseHelper.getResponse(
                emailService.send(email),
                HttpStatus.OK
        );
    }
}
