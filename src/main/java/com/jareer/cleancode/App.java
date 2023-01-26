package com.jareer.cleancode;

import com.jareer.cleancode.builder.Account;
import com.jareer.cleancode.builder.Address;
import com.jareer.cleancode.builder.Name;

import java.util.List;

public class App {
    public static void main(String[] args) {

        /**
         * @aproach first
         * */

        //  Account account=new Account(1,"java222@gmail.com","java",null,"",50,"Pushkin road","","Moscow");

        /**
         * @aproach second
         * */

        Name name = new Name.Builder().firstName("java")
                .middleName(List.of("javaBackend"))
                .surname("oracle")
                .build();


        Address address = new Address.Builder()
                .city("Moscow")
                .houseNumber(32)
                .street("Pushkin")
                .zipCode("20000")
                .build();


        Account account = new Account.Builder()
                .id(1)
                .email("java123@gmail.com")
                .addres(address)
                .name(name)
                .build();

    }
}
