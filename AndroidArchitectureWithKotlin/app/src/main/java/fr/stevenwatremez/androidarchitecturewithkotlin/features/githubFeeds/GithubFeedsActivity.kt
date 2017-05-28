package fr.stevenwatremez.androidarchitecturewithkotlin.features.githubFeeds

import android.arch.lifecycle.LifecycleActivity
import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import fr.stevenwatremez.androidarchitecturewithkotlin.R
import fr.stevenwatremez.androidarchitecturewithkotlin.features.githubFeeds.model.GithubFeed

class GithubFeedsActivity : LifecycleActivity() {

  lateinit private var viewModel: GithubFeedsViewModel

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    this.initFeeds()
  }

  fun initFeeds() {
    this.viewModel = ViewModelProviders.of(this).get(GithubFeedsViewModel::class.java)
    this.viewModel.feeds.observe(this, Observer<List<GithubFeed>> { feeds ->
      if (feeds != null) {
        this.updateUI(feeds = feeds)
      }
    })
  }

  fun updateUI(feeds: List<GithubFeed>) {

  }
}
