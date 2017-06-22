package com.codeup.svcs;

import com.codeup.models.Post;
import com.codeup.repositories.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by fer on 6/20/17.
 */
@Service("postSvc")
public class PostSvc {
    private  PostRepository postsDao;

    @Autowired
    public PostSvc(PostRepository postsDao) {
        this.postsDao = postsDao;
    }

        public Iterable<Post> findAll(){
        return postsDao.findAll();
    }


    public Post findPost(long id){
        return postsDao.findOne(id);
    }

    public Post save(Post post){
        postsDao.save(post);
        return post;
    }

//    public Post edit(Post post){
//        postsDao.save();
//        return post;
//    }


}