package com.example.nicolesapp.models

class Guide {
    var name:String = ""
    var description:String = ""
    var imageUrl:String = ""
    var id:String = ""

    constructor(name: String, description: String, imageUrl: String, id: String) {
        this.name = name
        this.description =description
        this.imageUrl = imageUrl
        this.id = id
    }

    constructor()
}