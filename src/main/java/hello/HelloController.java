package hello;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.Map;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@RestController
public class HelloController {

    @RequestMapping(value = "/", method = GET)
    public Map<String, String> index() {
        HashMap<String, String> map = new HashMap<>();
        map.put("status", "It's On");
        return map;
    }

    @RequestMapping(value = "/", method = POST)
    public Map<String, String> parseCrawler(@RequestBody Map<String, Object> payload) {
        HashMap<String, String> map = new HashMap<>();
        map.put("status", "success");
        System.out.println(payload.get("url"));
        return map;
    }


}