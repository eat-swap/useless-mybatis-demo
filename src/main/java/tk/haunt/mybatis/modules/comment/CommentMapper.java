package tk.haunt.mybatis.modules.comment;

import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface CommentMapper {

    @Select("SELECT * FROM comments WHERE post_id = #{postId}")
    List<Comment> findCommentsByPostId(long postId);

    @Select("SELECT * FROM comments WHERE id = #{id}")
    Comment findComment(long id);

    @Select("SELECT * FROM comments WHERE name = #{name}")
    List<Comment> findCommentsByName(String name);

    @Insert("INSERT INTO comments (content, name, post_id) VALUES (#{content}, #{name}, #{postId})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    void insertComment(Comment comment);

    @Update("UPDATE comments SET content = #{content}, name = #{name}, post_id = #{postId} WHERE id = #{id}")
    void updateComment(Comment comment);

    @Delete("DELETE FROM comments WHERE id = #{id}")
    void deleteComment(long id);

}
