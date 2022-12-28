package com.mohammadian.composetddexample

class HomeViewModel : BaseViewModel<
        HomeScreenContract.Event,
        HomeScreenContract.State,
        HomeScreenContract.Effect
        >() {
    override fun setInitialState(): HomeScreenContract.State {
        TODO("Not yet implemented")
    }
}