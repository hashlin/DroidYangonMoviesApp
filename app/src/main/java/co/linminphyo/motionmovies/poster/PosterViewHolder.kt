package co.linminphyo.motionmovies.poster

import android.view.View
import android.widget.ImageView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import co.linminphyo.motionmovies.R

/**
 * Created by lin min phyo on 2019-06-16.
 */


class PosterViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
  private val poster = itemView.findViewById<ImageView>(R.id.image_poster)

  fun renderImage(imageResourceId: Int) {
    poster.setImageDrawable(ContextCompat.getDrawable(itemView.context , imageResourceId))
  }

}