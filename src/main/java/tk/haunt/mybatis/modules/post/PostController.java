package tk.haunt.mybatis.modules.post;

import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tk.haunt.mybatis.modules.author.Author;
import tk.haunt.mybatis.modules.author.AuthorMapper;
import tk.haunt.mybatis.modules.blog.Blog;
import tk.haunt.mybatis.modules.blog.BlogMapper;

@RestController
@RequestMapping("/v1/posts")
public class PostController {

    @Autowired
    private SqlSessionFactory sqlSessionFactory;

    @GetMapping("/test")
    public Blog test() {
        try (var s = sqlSessionFactory.openSession()) {
            var ret = s.getMapper(BlogMapper.class).findBlogById(1);
            return ret;
        }
    }

}
