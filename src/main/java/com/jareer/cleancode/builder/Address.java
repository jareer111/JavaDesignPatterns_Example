package com.jareer.cleancode.builder;

public class Address {
    private final int houseNumber;
    private final String street;
    private final String zipCode;
    private final String city;

    public Address(Address.Builder builder) {
        this.houseNumber = builder.houseNumber;
        this.street = builder.street;
        this.zipCode = builder.zipCode;
        this.city = builder.city;
    }

    /**
     * @return the houseNumber
     */
    public int getHouseNumber() {
        return houseNumber;
    }

    /**
     * @return the street
     */
    public String getStreet() {
        return street;
    }

    /**
     * @return the zipCode
     */
    public String getZipCode() {
        return zipCode;
    }

    /**
     * @return the city
     */
    public String getCity() {
        return city;
    }

    public static class Builder {

        private int houseNumber;
        private String street;
        private String zipCode;
        private String city;

        public Builder houseNumber(final int houseNumber) {
            this.houseNumber = houseNumber;
            return this;
        }

        public Builder street(final String street) {
            this.street = street;
            return this;
        }

        public Builder zipCode(final String zipCode) {
            this.zipCode = zipCode;
            return this;
        }

        public Builder city(final String city) {
            this.city = city;
            return this;
        }

        public Address build() {
            return new Address(this);
        }


    }
}
