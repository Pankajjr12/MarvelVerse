package com.test.assignment.iccModels

import com.google.gson.annotations.SerializedName

class CricketMainModel {
        @SerializedName("Afghanistan")
        var team1: List<Afghanistan>? = null

        @SerializedName("Australia")
        var team2: List<Australia>? = null

        @SerializedName("Bangladesh")
        var team3: List<Bangladesh>? = null

        @SerializedName("England")
        var team4: List<England>? = null

        @SerializedName("India")
        var team5: List<India>? = null

        @SerializedName("New Zealand")
        var team6: List<NewZealand>? = null

        @SerializedName("Pakistan")
        var team7: List<Pakistan>? = null

        @SerializedName("South Africa")
        var team8: List<SouthAfrica>? = null

        @SerializedName("Sri Lanka")
        var team9: List<SriLanka>? = null

        @SerializedName("West Indies")
        var team10: List<WestIndy>? = null

}