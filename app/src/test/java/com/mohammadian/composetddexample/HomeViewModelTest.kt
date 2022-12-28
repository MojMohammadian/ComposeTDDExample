package com.mohammadian.composetddexample

import org.junit.Assert
import org.junit.Test

class HomeViewModelTest {
    private lateinit var testObject: HomeViewModel

    @Test
    fun `on home view model init validate loading state default value as true`() {
        //Assemble
        // We don't have any pre-requisite for this test

        //Act
        testObject = HomeViewModel()

        //Assert
        Assert.assertEquals(true, testObject.viewState.value.isLoading)
    }
    @Test
    fun `on home view model init validate post data state default value as empty posts list`() {
    }

    @Test
    fun `on home view model init get posts returns success with posts list data`() {
    }

    @Test
    fun `on home view model init get posts returns error with socket connection exception`() {
    }

    @Test
    fun `on home view model init get posts returns error with http exception`() {
    }

    @Test
    fun `on receiving error retry get posts returns success with posts list data`() {
    }
}