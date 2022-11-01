package tk.haunt.mybatis.modules.post;

import lombok.Data;

@Data
public class Post {

    private long id;

    private String content;

    private String tags;

    private String comments;

    public Post(long id, String content, String tags, String comments) {
        this.id = id;
        this.content = content;
        this.tags = tags;
        this.comments = comments;
    }

    public Post() {
    }
}
