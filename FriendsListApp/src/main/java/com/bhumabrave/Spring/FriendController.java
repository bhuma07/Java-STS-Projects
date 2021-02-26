package com.bhumabrave.Spring;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bhumabrave.friend.bean.Friend;

@RestController
public class FriendController {

	@RequestMapping("/friend/{friendId}")
	Friend getCompany(@PathVariable("friendId") int frdId) {
		Friend frd = new Friend();
		if (frdId == 1) {
			frd = new Friend(1, "pavan", "brother", "podili");
		} else if(frdId==2) {
			frd = new Friend(2, "satyam", "brother", "podili");
		}
		else {
			frd = new Friend(3, "kavya", "Friend", "US");
		}
		return frd;
	}

}
