package com.codeup.repositories;

import com.codeup.models.Post;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by emilioalvarado on 6/21/17.
 */
public interface PostRepository extends CrudRepository<Post, Long> {


}
