package xyz.atnrch.wrench.watcher

import xyz.atnrch.wrench.logger.Logger
import java.io.File

class WatcherManager(private val entries: MutableMap<Int, WatcherEntry>) {
    private var currentId: Int = -1

    fun addFile(file: File) {
        val watcherEntry = WatcherEntry(file, arrayListOf())
        currentId += 1
        entries[currentId] = watcherEntry
        Logger.info(
            """
            Tracking new file:
            ID: $currentId
            Name: ${file.name}
            Path: ${file.absolutePath}
        """.trimIndent()
        )
    }

    fun removeFile(id: Int) {
        entries.remove(id)
    }

    fun getEntries(): MutableMap<Int, WatcherEntry> {
        return entries
    }

    fun getFromId(id: Int): WatcherEntry? {
        if (id == -1) {
            return null
        }
        return entries[id]
    }
}