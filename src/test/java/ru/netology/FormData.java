package ru.netology;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class FormData {
    private String city;
    private String date;
    private String newDate;
    private String name;
    private String phone;
}