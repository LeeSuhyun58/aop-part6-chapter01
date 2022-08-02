package aop.fastcampus.part6.chapter01.model

import java.io.Serializable

data class BreadStore(
    var img : Int,
    var StoreName : String,
    var StoreStar : String,
    var StoreLocate : String
) : Serializable