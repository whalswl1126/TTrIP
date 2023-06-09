package org.sfy.ttrip.domain.repository.chat

import org.sfy.ttrip.data.remote.Resource
import org.sfy.ttrip.domain.entity.chat.ChatDetail
import org.sfy.ttrip.domain.entity.chat.ChatRoom
import org.sfy.ttrip.domain.entity.chat.CreateChat

interface ChatRepository {

    suspend fun getChatRooms(): Resource<List<ChatRoom>>

    suspend fun exitChatRoom(chatId: Int): Boolean

    suspend fun getChatDetail(chatId: Int): Resource<List<ChatDetail>>

    suspend fun createChatRoom(articleId: Int, opponentUserUuid: String): Resource<CreateChat>

    suspend fun chatMatch(articleId: Int, opponentUserUuid: String): Boolean
}