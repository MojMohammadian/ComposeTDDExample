package com.mohammadian.composetddexample
class HomeScreenContract {

    sealed class Event : ViewEvent

    data class State(
        val isLoading: Boolean = false,
        val postsListData: List<PostDto> = emptyList(),
        val error: String? = null,
    ) : ViewState

    sealed class Effect : ViewSideEffect {
        object OnError : Effect()
    }
}