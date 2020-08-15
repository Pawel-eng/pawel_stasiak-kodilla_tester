public class Application {
    public static void main(String[] args) {
        AppUser adam = new AppUser("Adam", 40.5, 178);
        checkUser(adam);

    }
    public static void checkUser(AppUser user){
        if (user.name != null) {
            if (user.age > 30 && user.height > 160) {
                System.out.println("User is older than 30 and higher than 160cm");
            } else {
                System.out.println("user is younger than 30 or lower than 160cm ");
            }
        }

    }

}
