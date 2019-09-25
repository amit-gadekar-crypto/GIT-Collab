package com.gitcollab.gitcollab.config;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties("api.provider.url")
public class ProviderUrl {
    private String gitHub;
    private String gitLab;

    public String getGitHub() {
        return gitHub;
    }

    public void setGitHub(String gitHub) {
        this.gitHub = gitHub;
    }

    public String getGitLab() {
        return gitLab;
    }

    public void setGitLab(String gitLab) {
        this.gitLab = gitLab;
    }
}
