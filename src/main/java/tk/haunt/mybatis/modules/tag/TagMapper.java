package tk.haunt.mybatis.modules.tag;

import org.apache.ibatis.annotations.*;

@Mapper
public interface TagMapper {

    @Select("SELECT * FROM tags WHERE id = #{id}")
    Tag findTagById(long id);

    @Select("SELECT * FROM tags WHERE tag = #{tag}")
    Tag findTagByTag(String tag);

    @Insert("INSERT INTO tags (tag) VALUES (#{tag})")
    @Options(useGeneratedKeys = true, keyColumn = "id", keyProperty = "id")
    void insertTag(Tag tag);

    @Update("UPDATE tags SET tag = #{tag} WHERE id = #{id}")
    void updateTag(Tag tag);

    @Delete("DELETE FROM tags WHERE id = #{id}")
    void deleteTag(long id);

}
