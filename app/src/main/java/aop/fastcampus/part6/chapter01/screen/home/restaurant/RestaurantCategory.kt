package aop.fastcampus.part6.chapter01.screen.home.restaurant

import androidx.annotation.StringRes
import aop.fastcampus.part6.chapter01.R

enum class RestaurantCategory(
    @StringRes val categoryNameId: Int,
    @StringRes val categoryTypeId: Int
) {
    AllBread(R.string.main, R.string.main_type),
    Bread1 (R.string.bread1, R.string.bread1_type),
    Bread2(R.string.bread2, R.string.bread2_type),
    Bread3(R.string.bread3, R.string.bread3_type),
    Bread4(R.string.bread4, R.string.bread4_type),
    Bread5(R.string.bread5, R.string.bread5_type),
    Bread6(R.string.bread6, R.string.bread6_type),
    Bread7(R.string.bread7, R.string.bread7_type),
    Bread8(R.string.bread8, R.string.bread8_type),
    Bread9(R.string.bread9, R.string.bread9_type),
    Bread10(R.string.bread10, R.string.bread10_type),
    Bread11(R.string.bread11, R.string.bread11_type),
    Bread12(R.string.bread12, R.string.bread12_type),
    Bread13(R.string.bread13, R.string.bread13_type),
    Bread14(R.string.bread14, R.string.bread14_type)
}
