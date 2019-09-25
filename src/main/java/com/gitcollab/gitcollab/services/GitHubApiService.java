package com.gitcollab.gitcollab.services;

import com.gitcollab.gitcollab.config.ProviderUrl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
public class GitHubApiService implements ApiProvider {

    @Autowired
    private WebClient.Builder webClientBuilder;

    @Autowired
    ProviderUrl providerUrl;

    public String getUserDetails(String username) {

        return webClientBuilder.build()
                .method(HttpMethod.GET)
                .uri(providerUrl.getGitHub() + "/users/" + username)
                .retrieve()
                .bodyToMono(String.class)
                .block();
    }


}
