package com.example.notekeeper

import org.junit.Test

import org.junit.Assert.*

class DataManagerTest {

    @Test
    fun addNote() {
        val course = DataManager.courses.get("android_async")!! // will throw NullException if null
        val noteTitle = "This is a test note"
        val noteText = "This is the body of my test note"

        val index = DataManager.addNote(course, noteTitle, noteText)

        assertEquals(DataManager.notes.lastIndex, index)
        val note = DataManager.notes[index]

        assertEquals(noteTitle, noteTitle)
        assertEquals(noteText, note.text)
        assertEquals(course, note.course)
    }
}