public class Author {
    private String name;
    private String email;
    private char gender;

    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //для методов getEmail(), setEmail(), и getGender() класс
    //не содержит методов сеттеров для полей данных - имени и пола, так как эти атрибуты не могут изменяться

    public String toString() {
        return (name + " (" + gender + ") at " + email);
    }

}
