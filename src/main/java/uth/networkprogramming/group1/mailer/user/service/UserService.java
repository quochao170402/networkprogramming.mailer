package uth.networkprogramming.group1.mailer.user.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import uth.networkprogramming.group1.mailer.user.model.User;

import java.util.List;

public interface UserService {
    List<User> getAll();

    Page<User> getAllPagination(Pageable page);

    List<String> getAllUserEmails();
}
