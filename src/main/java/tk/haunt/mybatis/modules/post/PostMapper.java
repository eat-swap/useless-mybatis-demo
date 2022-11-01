package tk.haunt.mybatis.modules.post;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface PostMapper {

    List<Post> findByAuthorId(long authorId);

    List<Post> findByTitle(String title);

    Post findById(long id);

    void insertPost(Post post);

    void updatePost(Post post);

    void deletePost(long id);

}
