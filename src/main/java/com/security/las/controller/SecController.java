package com.security.las.controller;


import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.security.access.annotation.Secured;
// import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.security.las.model.User;

@Controller
public class SecController {

    // @Autowired
	// private UserRepository userRepository;

	// @Autowired
	// private BCryptPasswordEncoder bCryptPasswordEncoder;

	@GetMapping({ "", "/" })
	public String index() {
		return "home";
	}

	@GetMapping("/user")
	public String user() {
		

		return "유저 페이지입니다.";
	}

	@GetMapping("/admin")
	public @ResponseBody String admin() {
		return "어드민 페이지입니다.";
	}
	
	//@PostAuthorize("hasRole('ROLE_MANAGER')")
	//@PreAuthorize("hasRole('ROLE_MANAGER')")
	@GetMapping("/manager")
	public @ResponseBody String manager() {
		return "매니저 페이지입니다.";
	}

	@GetMapping("/login")
	public String login() {
		return "login";
	}

	@GetMapping("/join")
	public String join() {
		return "join";
	}

	@PostMapping("/joinProc")
	public String joinProc(User user) {
		System.out.println("회원가입 진행 : " + user);
		String rawPassword = user.getPassword();
		// String encPassword = bCryptPasswordEncoder.encode(rawPassword);
		// user.setPassword(encPassword);
		// user.setRole("ROLE_USER");
		// userRepository.save(user);
		return "redirect:/";
	}
}