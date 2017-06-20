package com.codeup.svcs;

import com.codeup.models.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by emilioalvarado on 6/20/17.
 */
@Service("postSvc")
public class PostSvc {

    List<Post> posts = new ArrayList<>();

    public PostSvc() {
        createPosts();
    }

    public List<Post> findAll(){
        return posts;
    }

    public Post findPost(long id){
        return posts.get((int) id - 1);
    }

    public Post save(Post post) {
        post.setId((long) posts.size() + 1);
        posts.add(post);
        return post;
    }

    private void createPosts() {
        save(new Post("ps4", "new"));
        save(new Post("Xbox one", "Slightly used."));
    }

}
