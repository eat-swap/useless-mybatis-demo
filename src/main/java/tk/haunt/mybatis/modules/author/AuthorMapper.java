package tk.haunt.mybatis.modules.author;

import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface AuthorMapper {

    @Select("SELECT * FROM authors WHERE id = #{id}")
    Author findAuthor(long id);

    @Select("SELECT * FROM authors WHERE name = #{name}")
    Author findAuthorByName(String name);

    @Select("SELECT * FROM authors")
    List<Author> findAll();

    @Insert("INSERT INTO authors (name) VALUES (#{name})")
    @Options(useGeneratedKeys = true, keyColumn = "id", keyProperty = "id")
    void insertAuthor(Author author);

    @Update("UPDATE authors SET name = #{name} WHERE id = #{id}")
    void updateAuthor(Author author);

    @Delete("DELETE FROM authors WHERE id = #{id}")
    void deleteAuthor(long id);

}
