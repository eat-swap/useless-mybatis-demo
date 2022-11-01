package tk.haunt.mybatis.modules.comment;

import lombok.Data;

@Data
public class Comment {

    private long id;

    private String content;

    private String name;

    private long postId;

    public Comment() {
    }

    public Comment(long id, String content, String name, long postId) {
        this.id = id;
        this.content = content;
        this.name = name;
        this.postId = postId;
    }
}

