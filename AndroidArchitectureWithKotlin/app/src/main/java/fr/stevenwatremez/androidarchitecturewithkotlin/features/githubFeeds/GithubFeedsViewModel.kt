package fr.stevenwatremez.androidarchitecturewithkotlin.features.githubFeeds

import android.arch.lifecycle.ViewModel
import fr.stevenwatremez.androidarchitecturewithkotlin.features.githubFeeds.model.GithubFeed
import android.arch.lifecycle.MutableLiveData

class GithubFeedsViewModel: ViewModel() {
  val feeds = MutableLiveData<List<GithubFeed>>()
}