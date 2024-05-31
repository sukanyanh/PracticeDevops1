package ashokIt.PracticeDevops;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DevopsPractice {
    @GetMapping("/devops")
    public String print(String s){
        s="am devops engineer";
        return s;

    }
    @GetMapping("/name")
    public String sum(String name){
        name="meghraj";
        return name;

    }




}
