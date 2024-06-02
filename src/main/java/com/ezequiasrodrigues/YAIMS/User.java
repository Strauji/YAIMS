package com.ezequiasrodrigues.YAIMS;

import jakarta.persistence.*;

@Entity
@Table(name = "Users")
public class User {
    public static enum roles{
        root(0),
        manager(1),
        operator(2),
        observer(3);
        private final int id;

        public int getId() {
            return id;
        }
        roles(int id){
            this.id = id;
        }
    }
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String firstName;
    private String lastName;

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public roles getRole() {
        return role;
    }

    private roles role;
    private User(){}//O Hibernate precisa  de um construtor sem argumentos, então ta ai
    public User(String firstName, String lastName, roles role){
        this.firstName = firstName;
        this.lastName = lastName;
        this.role = role;
    }
}
