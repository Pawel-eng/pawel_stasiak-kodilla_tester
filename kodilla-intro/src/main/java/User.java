public class User {
    private String name;
    private int age;

    public User(String name,int age){
        this.name = name;
        this.age = age;
    }
    public static void main(String[] args) {
        String[] names = new String[]{"Anna", "Betty", "Carl", "David", "Eva", "Frankie"};
        int age;

        User anna = new User("Anna", 20);
        User betty = new User("Betty", 33);
        User carl = new User("Carl", 58);
        User david = new User("David", 13);
        User eva = new User("Eva", 18);
        User frankie = new User("Frankie", 45);

        User[] users = {anna, betty, carl, david, eva, frankie};

        int sum = 0;
        for (int i = 0; i < users.length; i++) {
            sum = sum + users[i].age;
        }

        int avg = sum/ users.length;


        for (int i = 0; i < users.length; i++) {
            System.out.println(avg);
            if (users[i].age<avg) {
                System.out.println(users[i].name);
            }
        }
    }
}
