package com.timbuchalka

import java.util.HashMap


class Location(val locationID: Int, val description: String) {
    private val exits: MutableMap<String, Int>

    init {
        this.exits = HashMap()
        this.exits.put("Q", 0)
    }

    fun getExits(): Map<String, Int> {
        return HashMap(exits)
    }

    protected fun addExit(direction: String, location: Int) {
        exits.put(direction, location)
    }
}