package fr.stevenwatremez.androidarchitecturewithkotlin.features.githubFeeds

import android.arch.lifecycle.ViewModel
import fr.stevenwatremez.androidarchitecturewithkotlin.features.githubFeeds.model.GithubEvent
import android.arch.lifecycle.MutableLiveData

class GithubEventsViewModel : ViewModel() {
  val feeds = MutableLiveData<List<GithubEvent>>()
}