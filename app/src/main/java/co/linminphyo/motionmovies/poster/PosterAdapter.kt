package co.linminphyo.motionmovies.poster

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.annotation.DrawableRes
import androidx.recyclerview.widget.RecyclerView
import co.linminphyo.motionmovies.R

/**
 * Created by lin min phyo on 2019-06-16.
 */

class PosterAdapter : RecyclerView.Adapter<PosterViewHolder>() {
  override fun onCreateViewHolder(
    parent: ViewGroup,
    viewType: Int
  ): PosterViewHolder {
    val view = LayoutInflater.from(parent.context).inflate(R.layout.item_image, parent , false)
    return PosterViewHolder(view)
  }

  override fun getItemCount(): Int {
    return 5
  }

  override fun onBindViewHolder(
    holder: PosterViewHolder,
    position: Int
  ) {

    holder.renderImage(generateImage(position))
  }


  @DrawableRes
  fun generateImage(position: Int) : Int {
    return when (position) {
      0 -> R.drawable.poster_aladdin
      1 -> R.drawable.poster_dark_phoenix
      2 -> R.drawable.poster_pets
      3 -> R.drawable.poster_john_wick
      else -> R.drawable.poster_battle_angel
    }
  }

}