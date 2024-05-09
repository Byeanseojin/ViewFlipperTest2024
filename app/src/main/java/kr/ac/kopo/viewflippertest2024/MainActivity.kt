package kr.ac.kopo.viewflippertest2024

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ViewFlipper

class MainActivity : AppCompatActivity() {
    lateinit var btnNext : Button
    lateinit var btnPrev : Button
    lateinit var btnStart : Button
    lateinit var btnStop : Button
    lateinit var vFlip : ViewFlipper
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        btnNext = findViewById<Button>(R.id.btnNext)
//        btnPrev = findViewById<Button>(R.id.btnPrev)
        btnStart = findViewById<Button>(R.id.btnStart)
        btnStop = findViewById<Button>(R.id.btnStop)
        vFlip = findViewById<ViewFlipper>(R.id.flipper)

//        btnNext.setOnClickListener(btnListener)
//        btnPrev.setOnClickListener(btnListener)
        btnStart.setOnClickListener(btnListener)
        btnStop.setOnClickListener(btnListener)

        vFlip.setFlipInterval(2000)

    }
//        val btnListener = View.OnClickListener {
//            when(it.id){
//            R.id.btnNext -> vFlip.showNext()
//            R.id.btnPrev -> vFlip.showPrevious()
//        }
//    }
        val btnListener= View.OnClickListener{
            when(it.id){
                R.id.btnStart -> vFlip.startFlipping()
                R.id.btnStop -> vFlip.stopFlipping()
            }
        }

}