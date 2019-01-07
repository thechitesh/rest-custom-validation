package hello;

import javax.validation.constraints.NotNull;

public class Greeting {

    private final long id;

    @NotNull(message = "Should not be null")
    private final String content;

    @NotNull(message = "Should not be null")
    private String name;

    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
