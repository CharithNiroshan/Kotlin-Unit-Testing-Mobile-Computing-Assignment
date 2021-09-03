package com.example.myassignment


import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotEquals
import org.junit.Test
import kotlin.math.sqrt

class SecondFragmentTest{
    val secondFragment =SecondFragment()

    //Test Squareroot

    @Test
    fun squareroot_for_positive_number(){
        assertEquals("Squareroot of the Value You Entered :${7}",secondFragment.getSquareRoot(49))
    }
    @Test
    fun squareroot_for_negative_number(){
        assertEquals("Squareroot of the Value You Entered :${0}",secondFragment.getSquareRoot(-49))
    }
    @Test
    fun squareroot_for_zero(){
        assertEquals("Squareroot of the Value You Entered :${0}",secondFragment.getSquareRoot(0))
    }

    //Test String

    @Test
    fun should_return_(){
        assertEquals("Full Course Name :21213 - SENG",secondFragment.createFullCourseName("21213","SENG"))
    }

    @Test
    fun should_not_return_full_cours(){
        assertNotEquals("Full Course Name :21213 - SENG",secondFragment.createFullCourseName("31233","SENG"))
    }
}