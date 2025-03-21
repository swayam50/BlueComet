package com.bluecomet.event_planner.repository;

import com.bluecomet.event_planner.model.entity.Event;
import com.bluecomet.event_planner.model.vo.EventStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
/**
 * @author Priyansu
 */
@Repository
public interface EventRepository extends JpaRepository<Event, Long> {
    Optional<Event> findByName(String name);

    List<Event> findByStatus(EventStatus status);

    List<Event> findByEventDateTimeBetween(LocalDateTime start, LocalDateTime end);
}
