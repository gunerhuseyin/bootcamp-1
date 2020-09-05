package org.kodluyoruz.trendyol.a.unittest;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class NameTest {

    @Test
    public void it_should_return_full_name() {
        // Given
        Name name = new Name();

        // When
        String fullName = name.getFullName("name", "surname");

        // Then
        assertThat(fullName).isEqualTo("name surname");
    }

    @Test
    public void it_should_return_only_name_when_surname_is_null() {
        // Given
        Name name = new Name();

        // When
        String fullName = name.getFullName("name", null);

        // Then
        assertThat(fullName).isEqualTo("name");
    }

}