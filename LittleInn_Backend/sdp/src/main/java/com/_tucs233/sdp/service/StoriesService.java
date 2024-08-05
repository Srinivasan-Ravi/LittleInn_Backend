package com._tucs233.sdp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com._tucs233.sdp.model.Stories;
import com._tucs233.sdp.repo.StoriesRepo;

import java.util.List;
import java.util.Optional;

@Service
public class StoriesService {

    @Autowired
    private StoriesRepo storyRepo;

    public List<Stories> getAllStories() {
        return storyRepo.findAll();
    }

    public Optional<Stories> getStoryById(long id) {
        return storyRepo.findById(id);
    }

    public Stories createStory(Stories story) {
        return storyRepo.save(story);
    }

    public String deleteStory(long id) {
        storyRepo.deleteById(id);
        return "Story Deleted " + id;
    }
}
