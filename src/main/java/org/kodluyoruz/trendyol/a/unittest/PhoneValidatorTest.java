package org.kodluyoruz.trendyol.a.unittest;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PhoneValidatorTest {

    @Test
    public void it_should_return_formatted_phone() {
        // Given
        String phone = "5373230808";

        // When
        String formattedPhone = PhoneValidator.getFormattedPhone(phone);

        // Then
        assertThat(formattedPhone).isEqualTo(phone);
    }

    @Test
    public void it_should_return_formatted_phone_if_phone_starts_with_ninety() {
        // Given
        String phone = "905373230808";

        // When
        String formattedPhone = PhoneValidator.getFormattedPhone(phone);

        // Then
        assertThat(formattedPhone).isEqualTo("5373230808");

    }

}