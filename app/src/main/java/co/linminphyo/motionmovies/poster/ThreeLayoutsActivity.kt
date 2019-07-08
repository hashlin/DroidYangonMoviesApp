package co.linminphyo.motionmovies.poster

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.motion.widget.MotionLayout
import androidx.constraintlayout.motion.widget.MotionLayout.TransitionListener
import co.linminphyo.motionmovies.R
import kotlinx.android.synthetic.main.layout_3_screens_combined.*
import kotlinx.android.synthetic.main.layout_more_movies_basics.*
import kotlinx.android.synthetic.main.layout_movie_info_with_synopsis.*

/**
 * Created by lin min phyo on 2019-06-26.
 */

class ThreeLayoutsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_3_screens_combined)

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
                if (motionLayout?.startState == R.id.frame_poster_top && motionLayout.endState == R.id.frame_more_movies_expanded) {
                    // Pass progress to child layout
                } else {
                    if (progress != 1f) {
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