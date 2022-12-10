package com.example.jetnews.data.interests.impl

import com.example.jetnews.data.Result
import com.example.jetnews.data.interests.InterestSection
import com.example.jetnews.data.interests.InterestsRepository
import com.example.jetnews.data.interests.TopicSelection
import kotlinx.coroutines.flow.Flow

class FakeInterestsRepository: InterestsRepository {
    override suspend fun getTopics(): Result<List<InterestSection>> {
        TODO("Not yet implemented")
    }

    override suspend fun getPeople(): Result<List<String>> {
        TODO("Not yet implemented")
    }

    override suspend fun getPublications(): Result<List<String>> {
        TODO("Not yet implemented")
    }

    override suspend fun toggleTopicSelection(topic: TopicSelection) {
        TODO("Not yet implemented")
    }

    override suspend fun togglePersonSelected(person: String) {
        TODO("Not yet implemented")
    }

    override suspend fun togglePublicationSelected(publication: String) {
        TODO("Not yet implemented")
    }

    override fun observeTopicsSelected(): Flow<Set<TopicSelection>> {
        TODO("Not yet implemented")
    }

    override fun observePeopleSelected(): Flow<Set<String>> {
        TODO("Not yet implemented")
    }

    override fun observePublicationSelected(): Flow<Set<String>> {
        TODO("Not yet implemented")
    }
}