package com.example.androiddevchallenge

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.ComposeView
import androidx.compose.ui.unit.dp
import androidx.navigation.fragment.navArgs

/**
 * A simple [Fragment] subclass.
 * create an instance of this fragment.
 */
class PuppyDetailFragment : Fragment() {

    var puppyId: String = ""
    lateinit var selectedPuppy: PuppyModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        puppyId = arguments?.getString("puppyId", "") ?: ""
        selectedPuppy = PuppyDatabase.puppiesList.first { puppy ->
            puppyId == puppy.id
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        return ComposeView(layoutInflater.context).apply {
            id = R.id.puppyDetailFragment

            layoutParams = ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT
            )

            setContent {
                Scaffold (
                    topBar = {
                        TopAppBar(
                            title = {
                                Text(
                                    text = selectedPuppy.name,
                                    style = MaterialTheme.typography.subtitle1)
                            }
                        )
                    },
                    content = {
                        Column(modifier = Modifier.padding(16.dp)) {
                            Text(text = selectedPuppy.description)
                            Spacer(modifier = Modifier.height(16.dp))
                            Button(onClick = {  }, modifier = Modifier.fillMaxWidth()) {
                                Text(text = "Adopt!")
                            }
                        }
                    }
                )
            }
        }
    }
}