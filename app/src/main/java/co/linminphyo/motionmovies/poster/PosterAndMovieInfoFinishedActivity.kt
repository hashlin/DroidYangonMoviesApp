package co.linminphyo.motionmovies.poster

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.motion.widget.MotionLayout
import androidx.constraintlayout.motion.widget.MotionLayout.TransitionListener
import co.linminphyo.motionmovies.R
import kotlinx.android.synthetic.main.layout_movie_info_with_synopsis.motion_layout_movie_info
import kotlinx.android.synthetic.main.layout_poster_and_movie_info_finished.motion_layout_poster_and_movie_info

/**
 * Created by lin min phyo on 2019-06-26.
 */

class PosterAndMovieInfoFinishedActivity : AppCompatActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.layout_poster_and_movie_info_finished)



    motion_layout_poster_and_movie_info.setTransitionListener(object : TransitionListener {
      override fun onTransitionTrigger(
        p0: MotionLayout?,
        p1: Int,
        p2: Boolean,
        p3: Float
      ) {

      }

      override fun onTransitionStarted(
        p0: MotionLayout?,
        p1: Int,
        p2: Int
      ) {

      }

      override fun onTransitionChange(
        p0: MotionLayout?,
        p1: Int,
        p2: Int,
        progress: Float
      ) {
        Log.i("Progress", progress.toString())
        if (progress != 1f) {
          motion_layout_movie_info.progress = progress
        }

      }

      override fun onTransitionCompleted(
        p0: MotionLayout?,
        p1: Int
      ) {
      }
    })

    motion_layout_poster_and_movie_info.progress = 1f
    motion_layout_movie_info.progress = 1f
  }
}