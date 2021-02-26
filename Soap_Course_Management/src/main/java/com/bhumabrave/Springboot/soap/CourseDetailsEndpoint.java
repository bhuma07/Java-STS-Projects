package com.bhumabrave.Springboot.soap;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.bhumabrave.courses.CourseDetails;
import com.bhumabrave.courses.GetCourseDetailsRequest;
import com.bhumabrave.courses.GetCourseDetailsResponse;

@Endpoint
public class CourseDetailsEndpoint {
	@PayloadRoot(namespace = "http://bhumabrave.com/courses", localPart = "GetCourseDetailsRequest")
	@ResponsePayload
	public GetCourseDetailsResponse processCourseDetailsRequest(@RequestPayload GetCourseDetailsRequest request) {
		GetCourseDetailsResponse response = new GetCourseDetailsResponse();
		CourseDetails courseDetails = new CourseDetails();
		courseDetails.setId(request.getId());
		courseDetails.setName("Microservices  Course");
		courseDetails.setDescription("That would be a wonderful  course!");
		response.setCourseDetails(courseDetails);
		return response;
	}

}
