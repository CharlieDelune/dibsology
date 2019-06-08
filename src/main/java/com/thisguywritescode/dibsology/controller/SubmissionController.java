package com.thisguywritescode.dibsology.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.thisguywritescode.dibsology.model.Submission;
import com.thisguywritescode.dibsology.repository.SubmissionRepository;

@Component
@Controller("submissionController")
public class SubmissionController {

	@Autowired
	SubmissionRepository submissionRepository;

	@GetMapping(value = "/thisistheREALtest/{id}")
	@CrossOrigin(origins = "http://localhost:3000")
	public ResponseEntity<Submission> test3(@PathVariable("id") int id) {
		Submission sub = null;
		HttpStatus status = HttpStatus.OK;
		try {
			sub = submissionRepository.getOne(id);
		} catch (Exception e) {
			System.out.println(e);
			status = HttpStatus.INTERNAL_SERVER_ERROR;
		}
		return new ResponseEntity<Submission>(sub, status);
	}
}
