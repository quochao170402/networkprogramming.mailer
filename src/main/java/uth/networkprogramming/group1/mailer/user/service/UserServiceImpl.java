package uth.networkprogramming.group1.mailer.user.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import uth.networkprogramming.group1.mailer.user.model.User;
import uth.networkprogramming.group1.mailer.user.repository.UserRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    @Transactional(readOnly = true)
    public List<User> getAll() {
        return userRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Page<User> getAllPagination(Pageable page) {
        return userRepository.findAll(page);
    }

    @Override
    @Transactional(readOnly = true)
    public List<String> getAllUserEmails() {
        return getAll().stream()
                .map(User::getEmail)
                .collect(Collectors.toList());
    }
}
