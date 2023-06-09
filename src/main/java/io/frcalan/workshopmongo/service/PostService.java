package io.frcalan.workshopmongo.service;

import io.frcalan.workshopmongo.domain.Post;
import io.frcalan.workshopmongo.domain.User;
import io.frcalan.workshopmongo.dto.UserDTO;
import io.frcalan.workshopmongo.repository.PostRepository;
import io.frcalan.workshopmongo.repository.UserRepository;
import io.frcalan.workshopmongo.service.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class PostService {

    @Autowired
    private PostRepository repo;

    public Post findById(String id) {
        Optional<Post> post = repo.findById(id);
        return post.orElseThrow(() -> new ObjectNotFoundException("Post not found."));
    }

    public List<Post> findByTitle(String text) {
        return repo.findByTitleContainingIgnoreCase(text);
    }

    public List<Post> searchTitle(String text) {
        return repo.searchTitle(text);
    }

    public List<Post> fullSearch(String text, Date minDate, Date maxDate) {
        maxDate = new Date(maxDate.getTime() + 24 * 60 * 60 * 1000);
        return repo.fullSearch(text, minDate, maxDate);
    }
}
