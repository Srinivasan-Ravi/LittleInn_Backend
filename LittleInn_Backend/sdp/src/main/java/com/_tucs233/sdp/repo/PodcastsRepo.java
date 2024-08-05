package com._tucs233.sdp.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com._tucs233.sdp.model.Podcasts;
import java.util.List;


public interface PodcastsRepo extends JpaRepository<Podcasts, Long> {
     List<Podcasts> findByPodcastId(long podcastId);
}
