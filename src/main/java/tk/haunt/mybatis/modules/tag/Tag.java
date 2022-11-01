package tk.haunt.mybatis.modules.tag;

import lombok.Data;

@Data
public class Tag {

    private long id;

    private String tag;

    public Tag(long id, String tag) {
        this.id = id;
        this.tag = tag;
    }

    public Tag(String tag) {
        this.id = 0;
        this.tag = tag;
    }

    public Tag() {
    }

}
