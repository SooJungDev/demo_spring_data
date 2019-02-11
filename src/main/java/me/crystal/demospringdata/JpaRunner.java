package me.crystal.demospringdata;

import org.hibernate.Session;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Component
@Transactional
public class JpaRunner implements ApplicationRunner {

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public void run(ApplicationArguments args) throws Exception {
 /*       Account account = new Account();
        account.setUsername("soojung");
        account.setPassword("hibernate");

        Study study = new Study();
        study.setName("Spring data JPA");

        account.addStudy(study);*/

 /*       Post post = new Post();
        post.setTitle("Spring Data JPA언제보나...");

        Comment comment = new Comment();
        comment.setComment("빨리 보고싶어요");
        post.addComment(comment);

        Comment comment1 = new Comment();
        comment1.setComment("곧보여드릴게요.");
        post.addComment(comment1);*/


        Session session = entityManager.unwrap(Session.class);
        Post post = session.get(Post.class, 1L);
        session.delete(post);
/*        session.persist(account);
        session.save(study);

        Account soojung = session.load(Account.class, account.getId());
        soojung.setUsername("crystal");
        System.out.println("---------------------");
        System.out.println(soojung.getUsername());*/
    }
}
