package co.linminphyo.motionmovies.poster

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import co.linminphyo.motionmovies.R
import kotlinx.android.synthetic.main.layout_catalog.button_3_layouts_combined
import kotlinx.android.synthetic.main.layout_catalog.button_3_layouts_combined_finished
import kotlinx.android.synthetic.main.layout_catalog.button_3_layouts_combined_polished
import kotlinx.android.synthetic.main.layout_catalog.button_more_movies_basics
import kotlinx.android.synthetic.main.layout_catalog.button_movie_info_basics
import kotlinx.android.synthetic.main.layout_catalog.button_movie_info_positioning
import kotlinx.android.synthetic.main.layout_catalog.button_movie_info_with_synopsis
import kotlinx.android.synthetic.main.layout_catalog.button_movie_poster
import kotlinx.android.synthetic.main.layout_catalog.button_poster_and_movie_info
import kotlinx.android.synthetic.main.layout_catalog.button_poster_and_movie_info_finished
import kotlinx.android.synthetic.main.layout_catalog.button_poster_and_movie_info_with_card_elevation
import kotlinx.android.synthetic.main.layout_catalog.button_poster_and_movie_info_with_keyframes

/**
 * Created by lin min phyo on 2019-06-26.
 */

class CatalogActivity : AppCompatActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.layout_catalog)


    button_movie_poster.setOnClickListener {
      startActivity(Intent(this, PosterActivity::class.java))
    }

    button_movie_info_basics.setOnClickListener {
      startActivity(Intent(this, MovieInfoBasicsActivity::class.java))
    }


    button_more_movies_basics.setOnClickListener {
      startActivity(Intent(this, MoreMoviesBasicsActivity::class.java))
    }

    button_movie_info_with_synopsis.setOnClickListener {
      startActivity(Intent(this, MovieInfoWithSynopsisActivity::class.java))
    }

    button_poster_and_movie_info.setOnClickListener {
      startActivity(Intent(this, PosterAndMovieInfo1Activity::class.java))
    }
    button_poster_and_movie_info_with_card_elevation.setOnClickListener {
      startActivity(Intent(this, PosterAndMovieInfo1WithCardElevationsActivity::class.java))
    }


    button_poster_and_movie_info_with_keyframes.setOnClickListener {
      startActivity(Intent(this, PosterAndMovieInfo1WithKeyFramesActivity::class.java))
    }

    button_poster_and_movie_info_finished.setOnClickListener {
      startActivity(Intent(this, PosterAndMovieInfoFinishedActivity::class.java))
    }

    button_movie_info_positioning.setOnClickListener {
      startActivity(Intent(this, MoreMoviesPositioningActivity::class.java))
    }

    button_3_layouts_combined.setOnClickListener {
      startActivity(Intent(this, ThreeLayoutsActivity::class.java))
    }

    button_3_layouts_combined_finished.setOnClickListener {
      startActivity(Intent(this, ThreeLayoutsFinishedActivity::class.java))
    }


    button_3_layouts_combined_polished.setOnClickListener {
      startActivity(Intent(this, ThreeLayoutsPolishedActivity::class.java))
    }
  }
}