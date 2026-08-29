package com.bharat.conflite.page;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface PageRepository extends CrudRepository<Page, String> {

    Optional<Page> findBySlug(String slug);

    boolean existsBySlug(String slug);

    List<Page> findAllByOrderByUpdatedAtDesc();

    List<Page> findAllByOwnerIdOrderByUpdatedAtDesc(String ownerId);

    @Query("""
            SELECT *
            FROM pages
            WHERE title LIKE :query COLLATE NOCASE
               OR markdown LIKE :query COLLATE NOCASE
            ORDER BY updated_at DESC
            """)
    List<Page> search(String query);
}
