package kg.itacademy.dao;

import kg.itacademy.model.User;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserDao {

    private static final Map<Integer, User> userMap =
            new HashMap<Integer, User>();

    static {
        initEmps();
    }

    private static void initEmps() {
        User user1 = new User(1, "Alisher","Alisher","123",
                "123@tr.kg",true);
        User user2 = new User(2, "Lionel","Lionel","1234",
                "12asd3@tr.kg",true);
        User user3 = new User(3, "Andre","Andre","1234",
                "1232@tr.kg",true);

        userMap.put(user1.getId(), user1);
        userMap.put(user2.getId(), user2);
        userMap.put(user3.getId(), user3);
    }

    public static User getUser(Integer userId) {
        return userMap.get(userId);
    }

    /*public static User getUserBySecret(String secret) {
        for()
        return userMap.get(userId);
    }*/

    public static User addUser(User user) {
        userMap.put(user.getId(), user);
        return user;
    }

    public static boolean auth(String login, String password){
        boolean notFound = true;
        for (User u : UserDao.getAllUser()) {
            if (u.getLogin().equals(login)
                    && u.getPassword().equals(password)) {
                notFound = false;
            }
        }
        return notFound;
    }

    public static User updateUser(User user) {
        userMap.put(user.getId(), user);
        return user;
    }

    public static void deleteUser(Integer userId) {
        userMap.remove(userId);
    }

    public static List<User> getAllUser() {
        Collection<User> c = userMap.values();
        List<User> list = new ArrayList<User>();
        list.addAll(c);
        return list;
    }

}