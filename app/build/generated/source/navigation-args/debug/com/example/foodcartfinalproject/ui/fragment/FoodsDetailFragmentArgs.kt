package com.example.foodcartfinalproject.ui.fragment

import android.os.Bundle
import android.os.Parcelable
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavArgs
import com.example.foodcartfinalproject.`data`.entity.Foods
import java.io.Serializable
import java.lang.IllegalArgumentException
import java.lang.UnsupportedOperationException
import kotlin.Suppress
import kotlin.jvm.JvmStatic

public data class FoodsDetailFragmentArgs(
  public val food: Foods,
) : NavArgs {
  @Suppress("CAST_NEVER_SUCCEEDS")
  public fun toBundle(): Bundle {
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

  @Suppress("CAST_NEVER_SUCCEEDS")
  public fun toSavedStateHandle(): SavedStateHandle {
    val result = SavedStateHandle()
    if (Parcelable::class.java.isAssignableFrom(Foods::class.java)) {
      result.set("food", this.food as Parcelable)
    } else if (Serializable::class.java.isAssignableFrom(Foods::class.java)) {
      result.set("food", this.food as Serializable)
    } else {
      throw UnsupportedOperationException(Foods::class.java.name +
          " must implement Parcelable or Serializable or must be an Enum.")
    }
    return result
  }

  public companion object {
    @JvmStatic
    @Suppress("DEPRECATION")
    public fun fromBundle(bundle: Bundle): FoodsDetailFragmentArgs {
      bundle.setClassLoader(FoodsDetailFragmentArgs::class.java.classLoader)
      val __food : Foods?
      if (bundle.containsKey("food")) {
        if (Parcelable::class.java.isAssignableFrom(Foods::class.java) ||
            Serializable::class.java.isAssignableFrom(Foods::class.java)) {
          __food = bundle.get("food") as Foods?
        } else {
          throw UnsupportedOperationException(Foods::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        if (__food == null) {
          throw IllegalArgumentException("Argument \"food\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"food\" is missing and does not have an android:defaultValue")
      }
      return FoodsDetailFragmentArgs(__food)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle): FoodsDetailFragmentArgs {
      val __food : Foods?
      if (savedStateHandle.contains("food")) {
        if (Parcelable::class.java.isAssignableFrom(Foods::class.java) ||
            Serializable::class.java.isAssignableFrom(Foods::class.java)) {
          __food = savedStateHandle.get<Foods?>("food")
        } else {
          throw UnsupportedOperationException(Foods::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        if (__food == null) {
          throw IllegalArgumentException("Argument \"food\" is marked as non-null but was passed a null value")
        }
      } else {
        throw IllegalArgumentException("Required argument \"food\" is missing and does not have an android:defaultValue")
      }
      return FoodsDetailFragmentArgs(__food)
    }
  }
}
