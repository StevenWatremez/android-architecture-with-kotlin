package fr.stevenwatremez.androidarchitecturewithkotlin.features.githubFeeds.model

import java.util.*

data class GithubEvent(val identifier: String, val repo: String, val event: String, val createdAt: Date)