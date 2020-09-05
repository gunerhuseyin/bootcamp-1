package org.kodluyoruz.trendyol.e.errorhandling;

public interface UserRepository {
    User findUserByUserId(Long id);
}
