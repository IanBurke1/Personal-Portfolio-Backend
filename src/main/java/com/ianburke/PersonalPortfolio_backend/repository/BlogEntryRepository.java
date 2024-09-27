package com.ianburke.PersonalPortfolio_backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ianburke.PersonalPortfolio_backend.model.BlogEntry;

@Repository
public interface BlogEntryRepository extends JpaRepository<BlogEntry,  Long>{

}
