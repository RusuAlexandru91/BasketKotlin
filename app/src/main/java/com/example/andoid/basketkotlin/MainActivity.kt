package com.example.andoid.basketkotlin

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private var scoreForTeamA: Int = 0
    private var scoreForTeamB: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        addOneForTeamA.setOnClickListener {
            scoreForTeamA += 1
            displayForTeamA(scoreForTeamA)
        }
        addOneForTeamB.setOnClickListener {
            scoreForTeamB += 1
            displayForTeamB(scoreForTeamB)
        }
        addTwoForTeamA.setOnClickListener {
            scoreForTeamA += 2
            displayForTeamA(scoreForTeamA)
        }
        addTwoForTeamB.setOnClickListener {
            scoreForTeamB += 2
            displayForTeamB(scoreForTeamB)
        }
        addThreeForTeamA.setOnClickListener {
            scoreForTeamA += 3
            displayForTeamA(scoreForTeamA)
        }
        addThreeForTeamB.setOnClickListener {
            scoreForTeamB += 3
            displayForTeamB(scoreForTeamB)
        }

        resetScore.setOnClickListener {
            scoreForTeamA = 0
            scoreForTeamB = 0
            displayForTeamA(scoreForTeamA)
            displayForTeamB(scoreForTeamB)
        }

    }
    private fun displayForTeamA(score: Int){
        scoreTeamA.text = score.toString()
    }
    private fun displayForTeamB(score: Int){
        scoreTeamB.text = score.toString()
    }
}