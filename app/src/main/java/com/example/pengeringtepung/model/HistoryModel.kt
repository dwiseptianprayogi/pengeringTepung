package com.example.pengeringtepung.model

class HistoryModel(temp:String, hum:String, volt:String, beratAwal:String, beratAkhir:String, kadarAir:String, status:String, timeStamp:String ) {
    var temp = ""
    var hum = ""
    var volt = ""
    var beratAwal = ""
    var beratAkhir = ""
    var status = ""
    var kadarAir = ""
    var timeStamp = ""

    init {
        this.temp = temp
        this.hum = hum
        this.volt = volt
        this.beratAwal = beratAwal
        this.beratAkhir = beratAkhir
        this.kadarAir = kadarAir
        this.status = status
        this.timeStamp = timeStamp
    }
}