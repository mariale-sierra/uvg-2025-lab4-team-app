package com.uvg.teamapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.uvg.teamapp.repositorio.NewTeamRepositorio
import com.uvg.teamapp.ui.theme.TeamAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TeamAppTheme {
                // Obtenemos la lista de miembros desde el FakeTeamRepository
                val team = NewTeamRepositorio.FakeTeamRepository.getTeamMembers()

                // Mostramos tu pantalla con LazyColumn
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    TeamListScreen(
                        teamMembers = team,
                        // Para respetar el padding que te da el Scaffold
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}
