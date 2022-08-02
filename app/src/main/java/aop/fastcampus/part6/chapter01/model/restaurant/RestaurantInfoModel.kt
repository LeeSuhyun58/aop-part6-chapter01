package aop.fastcampus.part6.chapter01.model.restaurant

import aop.fastcampus.part6.chapter01.data.entity.restaurant.RestaurantDetailInfoEntity
import aop.fastcampus.part6.chapter01.data.entity.restaurant.RestaurantEntity
import aop.fastcampus.part6.chapter01.model.CellType
import aop.fastcampus.part6.chapter01.model.Model

data class RestaurantInfoModel(
    override val id: Long,
    override val type: CellType = CellType.DETAIL_INFO_CELL,
    val imageUrl: String,
    val restaurantId: Long,
    val restaurantTitle: String,
    val restaurantOpenTime: String,
    val restaurantCloseDate: String,
    val restaurantPNumber: String,
    val restaurantLocate: String,
    val restaurantCompany: String,
    val restaurantOwnerName: String,
    val restaurantCompanyNumber: String
) : Model(id, type) {

    fun toEntity() = RestaurantDetailInfoEntity(
        id,
        imageUrl,
        restaurantId,
        restaurantTitle,
        restaurantOpenTime,
        restaurantCloseDate,
        restaurantPNumber,
        restaurantLocate,
        restaurantCompany,
        restaurantOwnerName,
        restaurantCompanyNumber
    )

}
