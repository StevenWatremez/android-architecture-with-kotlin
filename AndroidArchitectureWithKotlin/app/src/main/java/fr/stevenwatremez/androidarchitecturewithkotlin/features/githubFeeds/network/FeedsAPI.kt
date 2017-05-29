package fr.stevenwatremez.androidarchitecturewithkotlin.features.githubFeeds.network

import fr.stevenwatremez.androidarchitecturewithkotlin.features.githubFeeds.model.GithubEvent
import retrofit2.Call
import retrofit2.http.GET

/**
 * Created by steven_watremez on 29/05/2017.
 */

interface GitHubService {
  @GET("/events")
  fun listEvents(): Call<List<GithubEvent>>
}