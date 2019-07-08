package co.linminphyo.motionmovies.poster

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.motion.widget.MotionLayout
import androidx.constraintlayout.motion.widget.MotionLayout.TransitionListener
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import co.linminphyo.motionmovies.R
import kotlinx.android.synthetic.main.layout_movie_info_with_synopsis.motion_layout_movie_info
import kotlinx.android.synthetic.main.layout_3_screens_combined.motion_layout_poster_and_movie_info
import kotlinx.android.synthetic.main.layout_more_movies_basics.motion_layout_more_movies
import kotlinx.android.synthetic.main.layout_movie_info_basics.*

/**
 * Created by lin min phyo on 2019-06-26.
 */

class ThreeLayoutsFinishedActivity : AppCompatActivity() {
  private val recyclerViewMoreMovies by lazy {
    this.findViewById<RecyclerView>(R.id.rv_more_movies).apply {
      layoutManager = LinearLayoutManager(context , RecyclerView.HORIZONTAL , false)
    }
  }


  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.layout_3_screens_combined_finished)



    recyclerViewMoreMovies.adapter = PosterAdapter()

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
        motionLayout: MotionLayout?,
        p1: Int,
        p2: Int,
        progress: Float
      ) {
        if(motionLayout?.startState == R.id.frame_poster_top && motionLayout.endState == R.id.frame_more_movies_expanded){
            motion_layout_more_movies.progress = progress
        }else{
          Log.i("Progress" , progress.toString())
          if(progress != 1f){
            motion_layout_movie_info.progress = progress
          }
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