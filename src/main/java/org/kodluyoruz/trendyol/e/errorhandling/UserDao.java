package org.kodluyoruz.trendyol.e.errorhandling;

import org.kodluyoruz.trendyol.e.errorhandling.exception.MissingUserIdException;

import java.util.Objects;

public class UserDao implements UserRepository {

    @Override
    public User findUserByUserId(Long userId) {
        if (Objects.isNull(userId)) {
            throw new MissingUserIdException("User id not provided");
        }

        return new User(1L, "name", "surname");
    }
}
