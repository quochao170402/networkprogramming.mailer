package uth.networkprogramming.group1.mailer.email.service;

import uth.networkprogramming.group1.mailer.email.model.Email;

public interface EmailService {
    Email send(Email email);
}
