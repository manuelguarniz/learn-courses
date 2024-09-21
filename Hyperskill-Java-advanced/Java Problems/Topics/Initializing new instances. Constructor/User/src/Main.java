class User {
    String login;
    String firstName;
    String lastName;

    public User(String login, String firstName, String lastName) {
        this.login = login;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    void comida() {
        System.out.println(firstName + " " + lastName);
    }
}

class B {
    public static void main(String[] args) {
        User user = new User("John", "Doe", "Doe");
        user.comida();
    }
}