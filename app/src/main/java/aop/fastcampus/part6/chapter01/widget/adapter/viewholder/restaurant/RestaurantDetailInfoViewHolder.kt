package aop.fastcampus.part6.chapter01.widget.adapter.viewholder.restaurant

import aop.fastcampus.part6.chapter01.databinding.ViewholderRestaurantDetailInfoBinding
import aop.fastcampus.part6.chapter01.extensions.clear
import aop.fastcampus.part6.chapter01.extensions.load
import aop.fastcampus.part6.chapter01.model.restaurant.RestaurantInfoModel
import aop.fastcampus.part6.chapter01.screen.base.BaseViewModel
import aop.fastcampus.part6.chapter01.util.provider.ResourcesProvider
import aop.fastcampus.part6.chapter01.widget.adapter.listener.AdapterListener
import aop.fastcampus.part6.chapter01.widget.adapter.listener.restaurant.RestaurantDetailInfoListener
import aop.fastcampus.part6.chapter01.widget.adapter.listener.restaurant.RestaurantLikeListListener
import aop.fastcampus.part6.chapter01.widget.adapter.viewholder.ModelViewHolder

class RestaurantDetailInfoViewHolder (
    private val binding: ViewholderRestaurantDetailInfoBinding,
    viewModel: BaseViewModel,
    resourcesProvider: ResourcesProvider
    ) : ModelViewHolder<RestaurantInfoModel>(binding, viewModel, resourcesProvider) {
    override fun reset() = with(binding) {
        restaurantImage.clear()
    }

    override fun bindData(model: RestaurantInfoModel) {
        super.bindData(model)
        with(binding) {
            restaurantImage.load(model.imageUrl, 24f)
            txtStoreInfoOpenDesc.text = model.restaurantOpenTime
            txtStoreInfoCloseDesc.text = model.restaurantCloseDate
            txtStoreInfoPNumberDesc.text = model.restaurantPNumber
            txtStoreInfoLocateDesc.text = model.restaurantLocate
            txtStoreInfoNameDesc.text = model.restaurantCompany
            txtStoreOwnerDesc.text = model.restaurantOwnerName
            txtStoreInfoNumberDesc.text = model.restaurantCompanyNumber
        }
    }

    override fun bindViews(model: RestaurantInfoModel, adapterListener: AdapterListener) = with(binding) {
        if (adapterListener is RestaurantDetailInfoListener) {
            root.setOnClickListener {
                adapterListener.onClickItem(model)
            }
        }
    }

}