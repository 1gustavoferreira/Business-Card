package br.com.gustavoferreira.businesscard.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
 data class BusinessCard(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val name: String,
    val company: String,
    val telephone: String,
    val email: String,
    val customBackground: String
)