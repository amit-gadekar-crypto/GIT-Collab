package com.gitcollab.gitcollab.model;

public class Userdetails {
    private String gitHubDetails;
    private String gitLabDetails;

    public Userdetails() { }

    public Userdetails(String gitHubDetails, String gitLabDetails) {
        this.gitHubDetails = gitHubDetails;
        this.gitLabDetails = gitLabDetails;
    }

    public String getGitHubDetails() {
        return gitHubDetails;
    }

    public Userdetails setGitHubDetails(String gitHubDetails) {
        this.gitHubDetails = gitHubDetails;
        return this;
    }

    public String getGitLabDetails() {
        return gitLabDetails;
    }

    public Userdetails setGitLabDetails(String gitLabDetails) {
        this.gitLabDetails = gitLabDetails;
        return this;
    }
}
