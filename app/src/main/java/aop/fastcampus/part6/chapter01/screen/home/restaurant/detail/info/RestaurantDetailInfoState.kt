package aop.fastcampus.part6.chapter01.screen.home.restaurant.detail.info

import aop.fastcampus.part6.chapter01.model.restaurant.RestaurantInfoModel


open class RestaurantDetailInfoState {

    object Uninitialized: RestaurantDetailInfoState()

    object Loading: RestaurantDetailInfoState()

    data class Success(
        val restaurantDetailInfo: List<RestaurantInfoModel>? = null
    ): RestaurantDetailInfoState()

}