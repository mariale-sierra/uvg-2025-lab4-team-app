package com.uvg.teamapp

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.uvg.teamapp.model.TeamMember

@Composable
fun TeamListScreen(teamMembers: List<TeamMember>, modifier: Modifier = Modifier) {
    LazyColumn(modifier = modifier) {
        items(teamMembers) { member ->
            Text(text = "${member.name} - ${member.description}")
        }
    }
}
