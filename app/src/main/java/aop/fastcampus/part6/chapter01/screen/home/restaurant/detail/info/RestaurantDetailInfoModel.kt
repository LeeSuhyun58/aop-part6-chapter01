package aop.fastcampus.part6.chapter01.screen.home.restaurant.detail.info

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import aop.fastcampus.part6.chapter01.data.entity.restaurant.RestaurantDetailInfoEntity
import aop.fastcampus.part6.chapter01.data.entity.restaurant.RestaurantFoodEntity
import aop.fastcampus.part6.chapter01.data.repository.restaurant.food.RestaurantFoodRepository
import aop.fastcampus.part6.chapter01.model.restaurant.FoodModel
import aop.fastcampus.part6.chapter01.model.restaurant.RestaurantInfoModel
import aop.fastcampus.part6.chapter01.screen.base.BaseViewModel
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch

class RestaurantDetailInfoModel (
    private val restaurantId: Long,
    private val detailInfoEntity: List<RestaurantDetailInfoEntity>,
    private val restaurantFoodRepository: RestaurantFoodRepository
    ) : BaseViewModel() {

    val restaurantDetailInfoData = MutableLiveData<List<RestaurantInfoModel>>()

    override fun fetchData(): Job = viewModelScope.launch {
        restaurantDetailInfoData.value = detailInfoEntity.map {
            RestaurantInfoModel(
                id = it.hashCode().toLong(),
                imageUrl = it.imageUrl,
                restaurantId = restaurantId,
                restaurantTitle = it.restaurantTitle,
                restaurantOpenTime = it.restaurantOpenTime,
                restaurantCloseDate = it.restaurantCloseDate,
                restaurantPNumber = it.restaurantPNumber,
                restaurantLocate = it.restaurantLocate,
                restaurantCompany = it.restaurantCompany,
                restaurantOwnerName = it.restaurantOwnerName,
                restaurantCompanyNumber = it.restaurantCompanyNumber

            )
        }
    }

    /*fun insertMenuInBasket(foodModel: FoodModel) = viewModelScope.launch {
        val restaurantMenuListInBasket = restaurantFoodRepository.getFoodMenuListInBasket(restaurantId)
        val foodMenuEntity = foodModel.toEntity(restaurantMenuListInBasket.size)
        val anotherRestaurantMenuListInBasket =
            restaurantFoodRepository.getAllFoodMenuListInBasket().filter { it.restaurantId != restaurantId }
        if (anotherRestaurantMenuListInBasket.isNotEmpty()) {
            isClearNeedInBasketLiveData.value = Pair(true, { clearMenuAndInsertNewMenuInBasket(foodMenuEntity) })
        } else {
            restaurantFoodRepository.insertFoodMenuInBasket(foodMenuEntity)
            menuBasketLiveData.value = foodMenuEntity
        }
    }

    private fun clearMenuAndInsertNewMenuInBasket(foodMenuEntity: RestaurantFoodEntity) = viewModelScope.launch {
        restaurantFoodRepository.clearFoodMenuListInBasket()
        restaurantFoodRepository.insertFoodMenuInBasket(foodMenuEntity)
        menuBasketLiveData.value = foodMenuEntity
    }*/


}