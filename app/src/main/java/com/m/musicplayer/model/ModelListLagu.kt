package com.m.musicplayer.model

import java.io.Serializable

/**
 * Created by Saeful Yasin on 28-10-2020.
 */

class ModelListLagu : Serializable {

    var strId: String? = null

    @JvmField
    var strJudulMusic: String? = null

    @JvmField
    var strNamaBand: String? = null

    @JvmField
    var strCoverLagu: String? = null

}
