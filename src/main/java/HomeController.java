import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class HomeController {

    @Autowired
    private UserRepository<User> userRepository;

    @GetMapping("/test")
    @ResponseBody
    public String getMethodName() {
        User user=new User();
        user.setName("Anurudh Singh");
        user.setEmail("hexatestinguser@yopmail.com");
        userRepository.save(user);

        return  "working";
    }
    

}
