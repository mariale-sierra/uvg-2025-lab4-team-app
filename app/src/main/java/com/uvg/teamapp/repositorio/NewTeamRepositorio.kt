package com.uvg.teamapp.repositorio
import com.uvg.teamapp.model.TeamMember

//  Lista de Fake Team Members
class NewTeamRepositorio {

    object FakeTeamRepository {
        fun getTeamMembers(): List<TeamMember> {
            return listOf(
                TeamMember("Emily", "Android Developer"),
                TeamMember("Alejandra", "Backend Developer, Manager"),
                TeamMember("Camila", "UI Designer"),
                TeamMember("Ariana", "UX Designer"),
                TeamMember("Georgia", "iOS Developer"),
            )
        }

    }
}