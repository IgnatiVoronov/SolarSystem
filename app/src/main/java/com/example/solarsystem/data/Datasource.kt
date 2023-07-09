package com.example.solarsystem.data

import com.example.solarsystem.R
import com.example.solarsystem.model.InformationModel

class Datasource {
    fun loadInformation(): List<InformationModel> {
        return listOf(
            InformationModel(R.string.title1, R.string.description1, R.drawable.image1),
            InformationModel(R.string.title2, R.string.description2, R.drawable.image2),
            InformationModel(R.string.title3, R.string.description3, R.drawable.image3),
            InformationModel(R.string.title4, R.string.description4, R.drawable.image4),
            InformationModel(R.string.title5, R.string.description5, R.drawable.image5),
            InformationModel(R.string.title6, R.string.description6, R.drawable.image6),
            InformationModel(R.string.title7, R.string.description7, R.drawable.image7),
            InformationModel(R.string.title8, R.string.description8, R.drawable.image8),
            InformationModel(R.string.title9, R.string.description9, R.drawable.image9),
            InformationModel(R.string.title10, R.string.description10, R.drawable.image10),
            InformationModel(R.string.title11, R.string.description11, R.drawable.image11),
            InformationModel(R.string.title12, R.string.description12, R.drawable.image12)
        )
    }
}