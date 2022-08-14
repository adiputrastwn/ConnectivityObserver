package com.adiputrastwn.connectivity

import kotlinx.coroutines.flow.Flow

interface ConnectivityObserver {
    enum class State {
        Available, Unavailable, Lost, Losing
    }

    fun observe(): Flow<State>
}