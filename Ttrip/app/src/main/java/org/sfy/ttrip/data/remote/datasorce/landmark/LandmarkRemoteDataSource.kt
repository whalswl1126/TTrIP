package org.sfy.ttrip.data.remote.datasorce.landmark

import okhttp3.MultipartBody

interface LandmarkRemoteDataSource {

    suspend fun getLandmarks(): List<LandmarkResponse>

    suspend fun createDoodle(
        positionX: Double,
        positionY: Double,
        positionZ: Double,
        doodleImgPath: MultipartBody.Part?,
        landmarkId: Int,
        latitude: Double,
        longitude: Double
    )
}