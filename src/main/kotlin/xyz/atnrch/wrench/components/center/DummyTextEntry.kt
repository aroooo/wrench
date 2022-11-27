package xyz.atnrch.wrench.components.center

import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.runtime.Composable
import xyz.atnrch.wrench.registery.RegisterComposable
import xyz.atnrch.wrench.watcher.WatcherEntry
import xyz.atnrch.wrench.watcher.WatcherManager
import java.io.File

@Composable
fun DummyTextEntry(
    watcherManager: WatcherManager,
    interactionSource: MutableInteractionSource,
    onEntrySelected: (id: Int) -> Unit
) {
    val id = 0
    RegisterComposable(id) {
        WatcherTextEntry(
            id,
            WatcherEntry(File("/home/aro/IdeaProjects/Wrench/dummy"), arrayListOf()),
            watcherManager,
            onEntrySelected,
            interactionSource
        )
    }
}