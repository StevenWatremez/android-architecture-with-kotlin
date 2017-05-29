package fr.stevenwatremez.androidarchitecturewithkotlin.features.githubFeeds

import android.arch.lifecycle.LifecycleActivity
import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import fr.stevenwatremez.androidarchitecturewithkotlin.R
import fr.stevenwatremez.androidarchitecturewithkotlin.features.githubFeeds.model.GithubEvent

class GithubEventsActivity : LifecycleActivity() {

  lateinit private var viewModel: GithubEventsViewModel

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    this.initFeeds()
  }

  fun initFeeds() {
    this.viewModel = ViewModelProviders.of(this).get(GithubEventsViewModel::class.java)
    this.viewModel.feeds.observe(this, Observer<List<GithubEvent>> { feeds ->
      if (feeds != null) {
        this.updateUI(events = feeds)
      }
    })
  }

  fun updateUI(events: List<GithubEvent>) {

  }
}
