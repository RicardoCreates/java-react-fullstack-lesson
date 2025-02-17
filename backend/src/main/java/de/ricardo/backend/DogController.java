package de.ricardo.backend;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/dog")
public class DogController {

    @GetMapping
    public String getName(){
        return "Wuffi";
    }

    @GetMapping("/story")
    public String getStory(){
        return  "Wuffi likes his Owner";
    }

    @PostMapping
    public String createStory(@RequestBody String story){
        return "Wuffis new Story: " + story;
    }
}
