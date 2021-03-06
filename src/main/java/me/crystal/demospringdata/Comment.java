package me.crystal.demospringdata;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.criteria.CriteriaBuilder;

@Entity
public class Comment {

    @Id
    @GeneratedValue
    private Long id;

    private String comment;


    private Integer likeCount = 0;

    public Integer getLikeCount() {
        return likeCount;
    }

    public void setLikeCount(Integer likeCount) {
        this.likeCount = likeCount;
    }

    @ManyToOne
    private Post post;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }
}
