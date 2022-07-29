package br.com.santander.businesscard.ui

import android.app.SearchManager
import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import br.com.santander.businesscard.R
import br.com.santander.businesscard.databinding.ActivityMainBinding

/**
 * A MainActivity basicamente mantém o NavHostController; todas as funcionalidades
 * do app serão implementadas em Fragments.
 */
class MainActivity : AppCompatActivity() {

    private val binding: ActivityMainBinding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }

}
