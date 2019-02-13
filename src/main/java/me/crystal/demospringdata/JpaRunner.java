package me.crystal.demospringdata;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.util.List;

@Component
@Transactional
public class JpaRunner implements ApplicationRunner {


    @Autowired
    PostRepository postRepository;


    @Override
    public void run(ApplicationArguments args) throws Exception {
       Post post = new Post();
       post.setTitle("spring");

       Comment comment = new Comment();
       comment.setComment("hello");

       postRepository.save(post);
    }
}
