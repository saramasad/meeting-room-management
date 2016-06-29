package com.progressoft.induction.meeting.rooms.management.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.progressoft.induction.meeting.rooms.management.Captcha;

/**
 * Defines a repository for Captcha.
 * 
 * @author u591
 *
 */
@Repository
public interface CaptchaRepository extends org.springframework.data.repository.Repository<Captcha, Integer> {

	Captcha findOne(Integer id);

	List<Captcha> findAll();
}
