package com.jareer.cleancode.builder;

/**
 * @author Javokhir544
 * @created 26 Jan 2023 14:01:03
 */

public class Account {
    private final int id;
    private final String email;
    private final Address address;
    private final Name name;

    private Account(Builder builder) {
        this.id = builder.id;
        this.email = builder.email;
        this.name = builder.name;
        this.address = builder.address;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @return the address
     */
    public Address getAddress() {
        return address;
    }

    /**
     * @return the name
     */
    public Name getName() {
        return name;
    }

    public static class Builder {
        private int id;
        private String email;
        private Address address;
        private Name name;

        public Builder id(final int id) {
            this.id = id;
            return this;
        }

        public Builder email(final String email) {
            this.email = email;
            return this;
        }

        public Builder addres(final Address address) {
            this.address = address;
            return this;
        }

        public Builder name(final Name name) {
            this.name = name;
            return this;
        }

        public Account build() {
            return new Account(this);
        }

    }
}
