package com.example.myassignment


import org.junit.Assert.*
import org.junit.Test

class SecondFragmentTest{
    val secondFragment =SecondFragment()

    //Test Squareroot

    @Test
    fun squareroot_for_positive_number(){
        assertEquals(7,secondFragment.getSquareRoot(49))
    }
    @Test
    fun squareroot_for_negative_number(){
        assertEquals(0,secondFragment.getSquareRoot(-49))
    }
    @Test
    fun squareroot_for_zero(){
        assertEquals(0,secondFragment.getSquareRoot(0))
    }

    //Test String

    @Test
    fun should_return_(){
        assertEquals("21213 - SENG",secondFragment.createFullCourseName("21213","SENG"))
    }

    @Test
    fun should_not_return_full_cours(){
        assertNotEquals("21213 - SENG",secondFragment.createFullCourseName("31233","SENG"))
    }
}