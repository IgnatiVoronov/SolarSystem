package com.example.solarsystem.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Affirmation(
    @StringRes val stringResourceId: Int,
    @StringRes val stringResourceId_1: Int,
    @DrawableRes val imageResourceId: Int) {
}