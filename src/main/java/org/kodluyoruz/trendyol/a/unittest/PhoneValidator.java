package org.kodluyoruz.trendyol.a.unittest;

public class PhoneValidator {

    // add test case for getFormattedPhone
    public static String getFormattedPhone(String phone) {
        if (phone.startsWith("90")) {
            return phone.substring(2);
        }

        return phone;
    }
}
