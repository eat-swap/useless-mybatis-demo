package tk.haunt.mybatis.modules.post;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PostMapper {

    List<Post> findByBlogId(long blogId);

    List<Post> findByTitle(String title);

    Post findById(long id);

    void insertPost(Post post);

    void insertPostTag(Post post);

    void updatePost(Post post);

    void deletePost(long id);

}
