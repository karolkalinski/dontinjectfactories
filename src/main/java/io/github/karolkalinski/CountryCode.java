package io.github.karolkalinski;

public enum CountryCode {
    SE, NONE, BE, ME;
    public static CountryCode countryFromCode(String country) {
        return valueOf(country);
    }
}
