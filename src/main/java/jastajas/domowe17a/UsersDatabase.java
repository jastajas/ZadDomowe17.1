package jastajas.domowe17a;

import org.springframework.stereotype.Repository;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Repository
public class UsersDatabase {

    private List<User> users;

    public UsersDatabase() {
        users = new ArrayList<>();
        users.add(new User("Janek", "Kowalski", 33));
        users.add(new User("Rysiek", "Nowak", 44));
        users.add(new User("Basia", "Zielińska", 25));
    }

//    public void addUserToFile() throws IOException {
//        FileWriter fw = new FileWriter("users.csv", true);
//        BufferedWriter bfw = new BufferedWriter(fw);
//
//        int last = users.size() - 1;
//
//        String newUser = users.get(last).getFirstName() + ";" +
//                users.get(last).getLastName() + ";" +
//                String.valueOf(users.get(last).getAge());
//        bfw.newLine();
//        bfw.write(newUser);
//        bfw.close();
//    }

    public List<User> getUsers() {
        return users;
    }
}
