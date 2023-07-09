package com.example.solarsystem


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.example.solarsystem.adapter.ItemAdapter
import com.example.solarsystem.data.Datasource
import com.example.solarsystem.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Initialize data.
        val myDataset = Datasource().loadInformation()
        binding.recyclerView.adapter = ItemAdapter(this, myDataset) { informationModel ->
            Log.d("My logs", "clicked on: ${getString(informationModel.title)}}")
            Toast.makeText(
                this,
                getString(informationModel.title) + getString(informationModel.description),
                Toast.LENGTH_SHORT
            ).show()

        }

        // Use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        binding.recyclerView.setHasFixedSize(true)
    }

}