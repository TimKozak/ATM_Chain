package builder;

public class Main {
    public static void main(String[] args) {
        User user = User.builder()
                .firstName("Tima")
                .lastName("Kozak")
                .age(30)
                .occupation("FrontEnd")
                .occupation("IT&BA UCU")
                .build();

        System.out.println(user);
    }
}
