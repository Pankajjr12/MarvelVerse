package com.pankaj.avengersassemble.views.fragments.characterDetail

import android.content.Context
import android.content.Intent
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class FactoryCharacterDetail(val context: Context, val intent: Intent): ViewModelProvider.Factory{
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(CharacterVM::class.java)) {
            return CharacterVM(context, intent) as T
        }
        throw IllegalArgumentException("")
    }
}