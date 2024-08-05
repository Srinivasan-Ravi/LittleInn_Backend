package com._tucs233.sdp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com._tucs233.sdp.model.Podcasts;
import com._tucs233.sdp.repo.PodcastsRepo;

import java.util.List;
import java.util.Optional;

@Service
public class PodcastsService {

    @Autowired
    private PodcastsRepo prepo;

    public List<Podcasts> getAllPodcasts() {
        return prepo.findAll();
    }

    public Optional<Podcasts> getPodcastById(long id) {
        return prepo.findById(id);
    }

    public Podcasts createPodcast(Podcasts cls) {
        return prepo.save(cls);
    }

    public Podcasts updatePodcast(long id, Podcasts cls) {
        if (prepo.existsById(id)) {
            cls.setPodcastId(id);
            return prepo.save(cls);
        } else {
            throw new RuntimeException("Class not found");
        }
    }

    public void deletePodcast(long id) {
        prepo.deleteById(id);
    }
}
