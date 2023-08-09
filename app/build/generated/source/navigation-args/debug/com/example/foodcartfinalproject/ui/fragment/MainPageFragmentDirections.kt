package com.example.foodcartfinalproject.ui.fragment

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.example.foodcartfinalproject.R
import com.example.foodcartfinalproject.`data`.entity.Foods
import java.io.Serializable
import java.lang.UnsupportedOperationException
import kotlin.Int
import kotlin.Suppress

public class MainPageFragmentDirections private constructor() {
  private data class MainToDetail(
    public val food: Foods,
  ) : NavDirections {
    public override val actionId: Int = R.id.mainToDetail

    public override val arguments: Bundle
      @Suppress("CAST_NEVER_SUCCEEDS")
      get() {
        val result = Bundle()
        if (Parcelable::class.java.isAssignableFrom(Foods::class.java)) {
          result.putParcelable("food", this.food as Parcelable)
        } else if (Serializable::class.java.isAssignableFrom(Foods::class.java)) {
          result.putSerializable("food", this.food as Serializable)
        } else {
          throw UnsupportedOperationException(Foods::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        return result
      }
  }

  public companion object {
    public fun mainToDetail(food: Foods): NavDirections = MainToDetail(food)

    public fun mainToCart(): NavDirections = ActionOnlyNavDirections(R.id.mainToCart)
  }
}
