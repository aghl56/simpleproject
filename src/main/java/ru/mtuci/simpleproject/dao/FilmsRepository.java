package ru.mtuci.simpleproject.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;
import ru.mtuci.simpleproject.model.Films;

@Transactional(readOnly = true)
public interface FilmsRepository extends JpaRepository <Films, Long> {
    @Transactional
    @Modifying
    @Query("DELETE FROM Films f where f.id=:id")
    int delete (@Param("id") Long id);
}

