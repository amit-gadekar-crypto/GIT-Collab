package com.gitcollab.gitcollab.controller;

import com.gitcollab.gitcollab.model.Userdetails;
import com.gitcollab.gitcollab.services.GitHubApiService;
import com.gitcollab.gitcollab.services.GitLabApiService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/gitcollab")
public class GitCollabController {

	private GitHubApiService gitHubApiService;
	private GitLabApiService gitLabApiService;

	public GitCollabController(GitHubApiService gitHubApiService, GitLabApiService gitLabApiService) {
		this.gitHubApiService = gitHubApiService;
		this.gitLabApiService = gitLabApiService;
	}

	@GetMapping("/users/{username}")
	public Userdetails getUser(@PathVariable String username) {
		String gitHubUserDetails = gitHubApiService.getUserDetails(username);
		String gitLabUserDetails = gitLabApiService.getUserDetails(username);

		Userdetails userdetails = new Userdetails();
		userdetails = userdetails.setGitHubDetails(gitHubUserDetails).setGitLabDetails(gitLabUserDetails);

		return userdetails;
	}
	
	
	
	
}
