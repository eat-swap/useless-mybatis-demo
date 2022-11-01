package tk.haunt.mybatis.modules.post;

import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tk.haunt.mybatis.modules.author.Author;
import tk.haunt.mybatis.modules.author.AuthorMapper;

@RestController
@RequestMapping("/v1/posts")
public class PostController {

    @Autowired
    private SqlSessionFactory sqlSessionFactory;

    @GetMapping("/test")
    public String test() {
        var x = sqlSessionFactory.openSession();
        var y = x.getMapper(AuthorMapper.class);
        var w = new Author("+++5");
        y.insertAuthor(w);
        System.out.println(w.getId());
        var z = y.findAuthor(w.getId());

        y.findAll().forEach(o -> y.deleteAuthor(o.getId()));

        return z.getName();
    }

}
