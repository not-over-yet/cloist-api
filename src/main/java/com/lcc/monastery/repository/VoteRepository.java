package com.lcc.monastery.repository;

import com.lcc.monastery.entity.Gathering;
import com.lcc.monastery.entity.Vote;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface VoteRepository extends JpaRepository<Vote, Long> {
    Optional<Vote> findByGatheringIdAndVoteProperty(Long gatheringId, Vote.VoteProperty voteProperty);

    Optional<Vote> findByGatheringAndVoteProperty(Gathering gathering, Vote.VoteProperty voteProperty);
}
