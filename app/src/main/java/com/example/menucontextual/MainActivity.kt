package com.example.menucontextual

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ContextMenu
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import com.example.menucontextual.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val imagen = binding.JuanchoTePresta
        registerForContextMenu(imagen)
    }

    override fun onCreateContextMenu(
        menu: ContextMenu?,
        v: View?,
        menuInfo: ContextMenu.ContextMenuInfo?
    ) {
        super.onCreateContextMenu(menu, v, menuInfo)
        menuInflater.inflate(R.menu.menu_contectual, menu)
        menu?.setHeaderTitle("Menu contextual")
    }

    override fun onContextItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.descargar_imagen -> {
                Toast.makeText(this, "Opcion descargar", Toast.LENGTH_SHORT).show()
                true
            }
            R.id.compartir_imagen -> {
                Toast.makeText(this, "Opcion compartir", Toast.LENGTH_SHORT).show()
                true
            }
            R.id.copiar_imagen -> {
                Toast.makeText(this, "Opcion copiar", Toast.LENGTH_SHORT).show()
                true
            }
            else -> super.onContextItemSelected(item)
        }
    }
}