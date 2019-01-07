package hello;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greeting")
    public Wrapper greeting(@RequestParam(value="name", defaultValue="World") String name) {
        Greeting greeting = new Greeting(counter.incrementAndGet(),
                String.format(template, name));
        Wrapper wrapper = new Wrapper();

        wrapper.setGreeting(greeting);
        wrapper.setName("Chitesh");
        return wrapper;
    }

    @PostMapping("/greeting")
    public ResponseEntity postGreets(@RequestBody @Valid Wrapper greeting){
        return ResponseEntity.ok("Done");
    }

}