package com.bhumabrave.Springboot.soap;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.bhumabrave.Springboot.soap.bean.Course;
import com.bhumabrave.Springboot.soap.service.CourseDetailsService;
import com.bhumabrave.courses.CourseDetails;
import com.bhumabrave.courses.DeleteCourseDetailsRequest;
import com.bhumabrave.courses.DeleteCourseDetailsResponse;
import com.bhumabrave.courses.GetAllCourseDetailsRequest;
import com.bhumabrave.courses.GetAllCourseDetailsResponse;
import com.bhumabrave.courses.GetCourseDetailsRequest;
import com.bhumabrave.courses.GetCourseDetailsResponse;

@Endpoint
public class CourseDetailsEndpoint {

	@Autowired
	CourseDetailsService service;

	@PayloadRoot(namespace = "http://bhumabrave.com/courses", localPart = "GetCourseDetailsRequest")
	@ResponsePayload
	public GetCourseDetailsResponse processCourseDetailsRequest(@RequestPayload GetCourseDetailsRequest request) {

		Course course = service.findById(request.getId());

		return mapCourseDetails(course);
	}

	private GetCourseDetailsResponse mapCourseDetails(Course course) {
		GetCourseDetailsResponse response = new GetCourseDetailsResponse();
		response.setCourseDetails(mapCourse(course));
		return response;
	}

	private GetAllCourseDetailsResponse mapAllCourseDetails(List<Course> courses) {
		GetAllCourseDetailsResponse response = new GetAllCourseDetailsResponse();
		for (Course course : courses) {
			CourseDetails mapCourse = mapCourse(course);
			response.getCourseDetails().add(mapCourse);
		}
		return response;
	}

	private CourseDetails mapCourse(Course course) {
		CourseDetails courseDetails = new CourseDetails();

		courseDetails.setId(course.getId());

		courseDetails.setName(course.getName());

		courseDetails.setDescription(course.getDecription());
		return courseDetails;
	}

	@PayloadRoot(namespace = "http://bhumabrave.com/courses", localPart = "GetAllCourseDetailsRequest")
	@ResponsePayload
	public GetAllCourseDetailsResponse processAllCourseDetailsRequest(
			@RequestPayload GetAllCourseDetailsRequest request) {

		List<Course> courses = service.findAll();

		return mapAllCourseDetails(courses);
	}

	@PayloadRoot(namespace = "http://bhumabrave.com/courses", localPart = "DeleteCourseDetailsRequest")
	@ResponsePayload
	public DeleteCourseDetailsResponse deleteCourseDetailsRequest(@RequestPayload DeleteCourseDetailsRequest request) {

		int status = service.deleteById(request.getId());

		DeleteCourseDetailsResponse response = new DeleteCourseDetailsResponse();
		response.setStatus(status);
		return response;
	}

}
