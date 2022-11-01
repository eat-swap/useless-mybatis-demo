package tk.haunt.mybatis.modules.post;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface PostRepository {

    @Select("SELECT * FROM posts")
    public List<Post> findAll();

}
