package tk.haunt.mybatis.modules.blog;

import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/blog")
public class BlogController {

    @Autowired
    private SqlSessionFactory sqlSessionFactory;

    @GetMapping("/{id}")
    public Blog test(@PathVariable long id) {
        try (var s = sqlSessionFactory.openSession()) {
            return s.getMapper(BlogMapper.class).findBlogById(id);
        }
    }

}
