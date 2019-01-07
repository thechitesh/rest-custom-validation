package hello;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

public class Wrapper {

    @Valid
    Greeting greeting;

    @NotNull(message = "Should not be null")
    private String name;


    public Greeting getGreeting() {
        return greeting;
    }

    public void setGreeting(Greeting greeting) {
        this.greeting = greeting;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
