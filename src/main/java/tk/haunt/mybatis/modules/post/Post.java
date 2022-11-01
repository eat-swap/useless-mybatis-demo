package tk.haunt.mybatis.modules.post;

import lombok.Data;
import tk.haunt.mybatis.modules.comment.Comment;
import tk.haunt.mybatis.modules.tag.Tag;

import java.util.List;

@Data
public class Post {

    private long id;

    private String title;

    private String content;

    private long blogId;

    private boolean published;

    private List<Tag> tags;

    private List<Comment> comments;

    public Post(long id, String title, String content, long blogId, List<Tag> tags, List<Comment> comments) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.blogId = blogId;
        this.tags = tags;
        this.comments = comments;
    }

    public Post() {
    }
}
