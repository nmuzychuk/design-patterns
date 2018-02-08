package com.nmuzychuk;

import java.time.LocalDate;

public class Form {
    private String username;
    private char[] password;
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;

    public Form(FormBuilder builder) {
        this.username = builder.username;
        this.password = builder.password;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.dateOfBirth = builder.dateOfBirth;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(username);
        builder.append(", ").append("*"); // Password placeholder

        if (firstName != null) {
            builder.append(", ").append(firstName);
        }

        if (lastName != null) {
            builder.append(", ").append(lastName);
        }

        if (dateOfBirth != null) {
            builder.append(", ").append(dateOfBirth);
        }

        return builder.toString();
    }

    public static class FormBuilder {
        private String username;
        private char[] password;
        private String firstName;
        private String lastName;
        private LocalDate dateOfBirth;

        FormBuilder(String username, char[] password) {
            this.username = username;
            this.password = password;
        }

        public FormBuilder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public FormBuilder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public FormBuilder dateOfBirth(LocalDate dateOfBirth) {
            this.dateOfBirth = dateOfBirth;
            return this;
        }

        public Form build() {
            return new Form(this);
        }
    }
}
