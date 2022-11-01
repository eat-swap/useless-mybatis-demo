package tk.haunt.mybatis.modules.post;

import tk.haunt.mybatis.modules.author.Author;
import tk.haunt.mybatis.modules.comment.Comment;
import tk.haunt.mybatis.modules.tag.Tag;

import java.util.List;

public class RegularPost extends Post {

    public RegularPost(long id, String title, String content, long blogId, List<Tag> tags, List<Comment> comments) {
        super(id, title, content, blogId, tags, comments);
        this.setPublished(true);
    }

    public RegularPost() {
        this.setPublished(true);
    }

}
