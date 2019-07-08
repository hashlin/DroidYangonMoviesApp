package co.linminphyo.motionmovies.poster

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import co.linminphyo.motionmovies.R

/**
 * Created by lin min phyo on 2019-06-26.
 */


class MoreMoviesBasicsActivity : AppCompatActivity() {

  private val recyclerViewMoreMovies by lazy {
    this.findViewById<RecyclerView>(R.id.rv_more_movies).apply {
      layoutManager = LinearLayoutManager(context , RecyclerView.HORIZONTAL , false)
    }
  }


  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.layout_more_movies_basics)

    recyclerViewMoreMovies.adapter = PosterAdapter()
  }

}