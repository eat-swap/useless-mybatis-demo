package tk.haunt.mybatis.modules.post;

import tk.haunt.mybatis.modules.author.Author;
import tk.haunt.mybatis.modules.comment.Comment;
import tk.haunt.mybatis.modules.tag.Tag;

import java.util.List;

public class DraftPost extends Post {

    public DraftPost(long id, String title, String content, long blogId, List<Tag> tags, List<Comment> comments) {
        super(id, title, content, blogId, tags, comments);
        this.setPublished(false);
    }

    public DraftPost() {
        this.setPublished(false);
    }

}
