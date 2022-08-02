package aop.fastcampus.part6.chapter01.data.entity.restaurant

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.parcelize.Parcelize

@Parcelize
@Entity
data class RestaurantDetailInfoEntity (
    @PrimaryKey val id: Long,
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
) : Parcelable
