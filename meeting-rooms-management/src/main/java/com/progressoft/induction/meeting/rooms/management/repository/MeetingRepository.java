package com.progressoft.induction.meeting.rooms.management.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.progressoft.induction.meeting.rooms.management.Meeting;

import java.util.List;

/**
 * @author Mhmd Salem Alhjaj.
 * @date 6/28/2016.
 */
@Repository
public interface MeetingRepository extends CrudRepository<Meeting,String> {

	List<Meeting> findAll();

}
