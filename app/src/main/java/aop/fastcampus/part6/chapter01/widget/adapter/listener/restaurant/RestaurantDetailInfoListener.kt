package aop.fastcampus.part6.chapter01.widget.adapter.listener.restaurant

import aop.fastcampus.part6.chapter01.model.restaurant.RestaurantInfoModel
import aop.fastcampus.part6.chapter01.model.restaurant.RestaurantModel
import aop.fastcampus.part6.chapter01.widget.adapter.listener.AdapterListener

interface RestaurantDetailInfoListener : AdapterListener {
    fun onClickItem(model: RestaurantInfoModel)
}