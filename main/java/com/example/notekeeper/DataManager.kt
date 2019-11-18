package com.example.notekeeper

object DataManager {
    val courses = HashMap<String, CourseInfo>()
    val notes = ArrayList<NoteInfo>()

    init {
        initializeCourses()
        initializeNotes()
    }

    fun addNote(course: CourseInfo, noteTitle: String, noteText: String): Int {
        notes.add(NoteInfo(course, noteTitle, noteText))
        return notes.lastIndex
    }

    private fun initializeCourses() {
        var course = CourseInfo("android_intents", "Andorid Programming with Intents")
        courses.set(course.courseId, course)

        course = CourseInfo(courseId = "android_async", title = "Android Async Programming and Services")
        courses.set(course.courseId, course)

        course = CourseInfo(title = "Java Fundamentals: The Java Language", courseId = "java_lang")
        courses.set(course.courseId, course)

        course = CourseInfo("java_core", "Java Fundamentals: The Core Platform")
        courses.set(course.courseId, course)
    }

    private fun initializeNotes() {
        var course = courses.get("android_intents")
        if(course != null) {
            var note = NoteInfo(
                course,
                "How do intents work",
                "Intents are used to make activities interact with each other"
            )
            notes += note;

            note = NoteInfo(
                course,
                "Do intents make flow better",
                "Yes, that is what it seems like"
            )
            notes += note;
        }

        course = courses.get("java_lang")
        if(course != null) {
            var note = NoteInfo(
                course,
                "Automatic Garbage collection ",
                "You do not need to free memory in java, it clears the memory when the object is out of scope automatically. Pretty cool"
            )
            notes += note;

            note = NoteInfo(
                course,
                "Is the syntax too long?",
                "Had it been not, we wouldn't have had Kotlin! Kotlin wooo!"
            )
            notes += note;
        }

        course = courses.get("android_async")
        if(course != null) {
            var note = NoteInfo(
                course,
                "Async seems to confusing! ",
                "It would not be if you follow this link."
            )
            notes += note;

            note = NoteInfo(
                course,
                "Well, async makes things faster.",
                "But a little less readable"
            )
            notes += note;
        }

        course = courses.get("java_core")
        if(course != null) {
            var note = NoteInfo(
                course,
                "JVM - Woo ",
                "Did someone call for a machine independent environment?"
            )
            notes += note;
        }
    }
}