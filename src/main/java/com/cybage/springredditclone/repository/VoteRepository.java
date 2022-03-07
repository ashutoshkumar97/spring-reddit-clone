package com.cybage.springredditclone.repository;

import com.cybage.springredditclone.model.Post;
import com.cybage.springredditclone.model.User;
import com.cybage.springredditclone.model.Vote;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface VoteRepository extends JpaRepository<Vote, Long> {

    Optional<Vote> findTopByPostAndUserOrderByVoteIdDesc(Post post, User currentUser);
}
