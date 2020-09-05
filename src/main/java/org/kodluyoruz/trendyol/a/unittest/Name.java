package org.kodluyoruz.trendyol.a.unittest;

import java.util.Objects;

public class Name {

    // add test case for getFullName

    public String getFullName(String name, String surname) {
        if (Objects.nonNull(name) && Objects.nonNull(surname)) {
            return name + " " + surname;
        }
        return name;
    }
}
