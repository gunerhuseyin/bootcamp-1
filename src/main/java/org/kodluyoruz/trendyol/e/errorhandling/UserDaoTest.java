package org.kodluyoruz.trendyol.e.errorhandling;

import org.junit.jupiter.api.Test;
import org.kodluyoruz.trendyol.e.errorhandling.exception.MissingUserIdException;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

public class UserDaoTest {

    @Test
    public void it_should_throw_exception_when_user_id_not_provided() {
        // Given
        UserDao userDao = new UserDao();

        // When
        Throwable throwable = catchThrowable(() -> userDao.findUserByUserId(null));

        // Then
        assertThat(throwable).isNotNull();
        assertThat(throwable).isInstanceOf(MissingUserIdException.class);
        assertThat(throwable).hasMessageContaining("User id not provided");
    }

}