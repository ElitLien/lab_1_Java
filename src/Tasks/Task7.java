package Tasks;

public class Task7 {
    static class User {
        public String firstName;
        public String lastName;
        public int age;
        public String email;

        @Override
        public boolean equals(Object o) {
            if (o == this)
                return true;
            if (o == null || getClass() != o.getClass())
                return false;

            User user = (User) o;

            if (age != user.age) return false;
            if (firstName != null ? !firstName.equals(user.firstName) : user.firstName != null) return false;
            if (lastName != null ? !lastName.equals(user.lastName) : user.lastName != null) return false;
            return email != null ? email.equals(user.email) : user.email == null;
        }

        @Override
        public int hashCode() {
            int res = age;

            res = 17 * res + (firstName == null ? 0 : firstName.hashCode());
            res = 17 * res + (lastName == null ? 0 : lastName.hashCode());
            res = 17 * res + (email == null ? 0 : email.hashCode());

            return res;
        }
    }

    public static void main(String[] args){
        User user1 = new User();
        User user2 = new User();
        User mainUser = new User();

        user1.age = 15;
        user2.age = 17;
        mainUser.age = 17;

        System.out.println(user1.hashCode());
        System.out.println(user2.hashCode());
        System.out.println(mainUser.hashCode());

        System.out.println(user1.equals(mainUser));
        System.out.println(user2.equals(mainUser));
    }
}
