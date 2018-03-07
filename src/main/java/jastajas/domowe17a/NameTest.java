package jastajas.domowe17a;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping("/main")
public class NameTest {

    private UsersDatabase usersDatabase;


    public NameTest(UsersDatabase usersDatabase) {
        this.usersDatabase = usersDatabase;
    }


    @RequestMapping("/users")
    @ResponseBody
    public String showUsers() {
        List<User> userslist = usersDatabase.getUsers();
        String allUsers = "";

        for (User user : userslist) {
            allUsers += user.toString() + "<br/>";
        }
        return allUsers;
    }

    @RequestMapping("/add")
    public String addUsers(@RequestParam(value = "name", required = false, defaultValue = "Anonim") String name, @RequestParam String surname, @RequestParam Integer age) {

            usersDatabase.getUsers().add(new User(name, surname, age));
           // usersDatabase.addUserToFile();
            return "/success.html";

    }

}
