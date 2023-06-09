package org.sfy.ttrip.data.remote.service

import org.sfy.ttrip.data.remote.datasorce.base.BaseResponse
import org.sfy.ttrip.data.remote.datasorce.board.*
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path

interface BoardApiService {

    @POST("/api/articles/new")
    suspend fun postBoard(@Body body: PostBoardRequest): BaseResponse<PostBoardResponse>

    @POST("/api/articles")
    suspend fun getBoardList(@Body body: SearchBoardRequest): BaseResponse<List<BoardBriefResponse>>

    @GET("/api/articles/{articleId}")
    suspend fun getBoardDetail(@Path("articleId") articleId: Int): BaseResponse<BoardDetailResponse>

    @POST("/api/articles/{articleId}/end")
    suspend fun finishBoard(@Path("articleId") articleId: Int)

    @DELETE("/api/articles/{articleId}")
    suspend fun deleteBoard(@Path("articleId") articleId: Int)

    @GET("/api/articles/{articleId}/applyArticle/")
    suspend fun getBoardComment(@Path("articleId") articleId: Int): BaseResponse<List<BoardCommentResponse>>

    @POST("/api/articles/newApply")
    suspend fun postComment(@Body body: CommentRequest)

    @POST("/api/articles/recommendation")
    suspend fun getRecommendBoard(@Body body: RecommendBoardRequest): BaseResponse<List<RecommendBoardResponse>>
}