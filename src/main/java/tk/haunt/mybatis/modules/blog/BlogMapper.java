package tk.haunt.mybatis.modules.blog;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BlogMapper {

    Blog findBlogById(long id);

}
