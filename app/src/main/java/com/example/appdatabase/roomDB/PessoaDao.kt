package com.example.appdatabase.roomDB

import androidx.room.Delete
import androidx.room.Query
import androidx.room.Upsert
import kotlinx.coroutines.flow.Flow

interface PessoaDao {

    @Upsert
    suspend fun upsertPessoa(pessoa: Pessoa)

    @Delete
    suspend fun deletePessoa(pessoa: Pessoa)

    @Query("SELECT * FROM Pessoa")
    fun getAllPessoa(): Flow<List<Pessoa>>

}