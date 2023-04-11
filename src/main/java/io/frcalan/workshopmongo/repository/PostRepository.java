package io.frcalan.workshopmongo.repository;

import io.frcalan.workshopmongo.domain.Post;
import io.frcalan.workshopmongo.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {
}
