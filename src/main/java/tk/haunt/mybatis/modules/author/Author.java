package tk.haunt.mybatis.modules.author;

import lombok.Data;

@Data
public class Author {

    private long id;

    private String name;

    public Author(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Author(String name) {
        this.id = 0;
        this.name = name;
    }

    public Author() {
    }

}
