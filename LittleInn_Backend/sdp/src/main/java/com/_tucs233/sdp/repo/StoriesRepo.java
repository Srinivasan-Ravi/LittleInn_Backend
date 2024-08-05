package com._tucs233.sdp.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com._tucs233.sdp.model.Stories;

public interface StoriesRepo extends JpaRepository<Stories, Long> {

}