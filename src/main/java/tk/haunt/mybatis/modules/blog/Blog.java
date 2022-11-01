package tk.haunt.mybatis.modules.blog;

import lombok.Data;
import tk.haunt.mybatis.modules.author.Author;
import tk.haunt.mybatis.modules.post.Post;

import java.util.List;

@Data
public class Blog {

    private long id;

    private Author author;

    private List<Post> posts;

    private BlogStatus status;

    public Blog(long id, Author author, List<Post> posts, BlogStatus status) {
        this.id = id;
        this.author = author;
        this.posts = posts;
        this.status = status;
    }

    public Blog() {
    }

}
