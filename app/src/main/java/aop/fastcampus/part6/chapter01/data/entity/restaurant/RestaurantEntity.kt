package aop.fastcampus.part6.chapter01.data.entity.restaurant

import android.os.Parcelable
import aop.fastcampus.part6.chapter01.data.entity.Entity
import aop.fastcampus.part6.chapter01.screen.main.restaurant.RestaurantCategory
import kotlinx.parcelize.Parcelize

@Parcelize
data class RestaurantEntity(
    override val id: Long,
    val restaurantInfoId: Long,
    val restaurantCategory: RestaurantCategory,
    val restaurantTitle: String,
    val restaurantImageUrl: String,
    val grade: Float,
    val reviewCount: Int,
    val keywords: List<String>,
    val deliveryTimeRange: Pair<Int, Int>,
    val deliveryTipRange: Pair<Int, Int>
): Entity, Parcelable