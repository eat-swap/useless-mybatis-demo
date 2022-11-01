package tk.haunt.mybatis.modules.post;

import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/posts")
public class PostController {

    @Autowired
    private SqlSessionFactory sqlSessionFactory;

    @GetMapping("/test")
    public String test() {
        var x = sqlSessionFactory.openSession();
        var y = x.getMapper(PostRepository.class);
        y.findAll().forEach(System.out::println);
        return "haha";
    }

}
