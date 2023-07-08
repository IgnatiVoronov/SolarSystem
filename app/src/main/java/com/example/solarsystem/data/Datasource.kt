package com.example.solarsystem.data

import com.example.solarsystem.R
import com.example.solarsystem.model.Affirmation

class Datasource {
    fun loadAffirmations() : List<Affirmation> {
        return listOf<Affirmation>(
            Affirmation(R.string.affirmation1, R.string.affirmation1_1, R.drawable.image1),
            Affirmation(R.string.affirmation2, R.string.affirmation2_1, R.drawable.image2),
            Affirmation(R.string.affirmation3, R.string.affirmation3_1, R.drawable.image3),
            Affirmation(R.string.affirmation4, R.string.affirmation4_1, R.drawable.image4),
            Affirmation(R.string.affirmation5, R.string.affirmation5_1, R.drawable.image5),
            Affirmation(R.string.affirmation6, R.string.affirmation6_1, R.drawable.image6),
            Affirmation(R.string.affirmation7, R.string.affirmation7_1, R.drawable.image7),
            Affirmation(R.string.affirmation8, R.string.affirmation8_1, R.drawable.image8),
            Affirmation(R.string.affirmation9, R.string.affirmation9_1, R.drawable.image9),
            Affirmation(R.string.affirmation10, R.string.affirmation10_1, R.drawable.image10),
            Affirmation(R.string.affirmation11, R.string.affirmation11_1, R.drawable.image11),
            Affirmation(R.string.affirmation12, R.string.affirmation12_1, R.drawable.image12)
        )
    }
}