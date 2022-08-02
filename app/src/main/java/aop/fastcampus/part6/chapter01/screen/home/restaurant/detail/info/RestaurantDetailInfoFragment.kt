package aop.fastcampus.part6.chapter01.screen.home.restaurant.detail.info

import android.os.Bundle
import aop.fastcampus.part6.chapter01.data.entity.restaurant.RestaurantDetailInfoEntity
import aop.fastcampus.part6.chapter01.databinding.ViewholderRestaurantDetailInfoBinding
import aop.fastcampus.part6.chapter01.screen.base.BaseFragment
import aop.fastcampus.part6.chapter01.screen.home.restaurant.detail.RestaurantDetailState
import aop.fastcampus.part6.chapter01.screen.home.restaurant.detail.RestaurantDetailViewModel
import aop.fastcampus.part6.chapter01.screen.home.restaurant.detail.menu.RestaurantMenuListFragment
import aop.fastcampus.part6.chapter01.screen.home.restaurant.detail.menu.RestaurantMenuListFragment.Companion.RESTAURANT_ID_KEY
import aop.fastcampus.part6.chapter01.screen.home.restaurant.detail.menu.RestaurantMenuListViewModel
import aop.fastcampus.part6.chapter01.screen.home.restaurant.detail.review.RestaurantReviewState
import org.koin.android.viewmodel.ext.android.sharedViewModel
import org.koin.android.viewmodel.ext.android.viewModel
import org.koin.core.parameter.parametersOf

class RestaurantDetailInfoFragment : BaseFragment<RestaurantDetailInfoModel, ViewholderRestaurantDetailInfoBinding>(){

    override fun getViewBinding(): ViewholderRestaurantDetailInfoBinding = ViewholderRestaurantDetailInfoBinding.inflate(layoutInflater)

    private val restaurantId by lazy { arguments?.getLong(RESTAURANT_ID, -1) }

    private val restaurantInfoList by lazy { arguments?.getParcelableArrayList<RestaurantDetailInfoEntity>(INFO_LIST_KEY)!! }

    override val viewModel by viewModel<RestaurantDetailInfoModel> { parametersOf(restaurantId, restaurantInfoList) }

    //private val restaurantDetailViewModel by sharedViewModel<RestaurantDetailViewModel>()

    companion object {
        const val RESTAURANT_ID = "restaurantId"
        const val INFO_LIST_KEY = "infoList"

        //infoList: ArrayList<RestaurantDetailInfoEntity>
        fun newInstance(restaurantId: Long): RestaurantDetailInfoFragment {
            val bundle = Bundle().apply {
                putLong(RESTAURANT_ID, restaurantId)
                //putParcelableArrayList(INFO_LIST_KEY, infoList)
            }

            return RestaurantDetailInfoFragment().apply {
                arguments = bundle
            }
        }

    }

    override fun observeData() {
        TODO("Not yet implemented")
    }
}