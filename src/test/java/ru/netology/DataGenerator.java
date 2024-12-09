package ru.netology;

import com.github.javafaker.Faker;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DataGenerator {
    private static final Faker faker = new Faker(new Locale("ru"));

    private DataGenerator() {
    }

    public static FormData generateFormData() {
        LocalDate currentDate = LocalDate.now();
        LocalDate deliveryDate = currentDate.plusDays(3);
        String formattedDate = deliveryDate.format(DateTimeFormatter.ofPattern("dd.MM.yyyy"));

        LocalDate deliveryNewDate = currentDate.plusDays(5);
        String formattedNewDate = deliveryNewDate.format(DateTimeFormatter.ofPattern("dd.MM.yyyy"));

        return new FormData(
                faker.address().cityName(),
                formattedDate, formattedNewDate,
                faker.name().fullName(),
                faker.phoneNumber().phoneNumber()
        );
    }
}