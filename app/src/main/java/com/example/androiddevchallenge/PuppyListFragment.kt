package com.example.androiddevchallenge

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.foundation.clickable
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Divider
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.ComposeView
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.fragment.findNavController
import com.example.androiddevchallenge.ui.theme.MyTheme

/**
 * A simple [Fragment] subclass.
 * create an instance of this fragment.
 */
class PuppyListFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        return ComposeView(layoutInflater.context).apply {
            id = R.id.puppyListFragment

            layoutParams = ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT
            )

            setContent {
                PuppyListScreen(puppies = createPuppies())
            }
        }
    }

    @Composable
    fun PuppyListScreen(puppies: List<PuppyModel>) {
        Surface(color = MaterialTheme.colors.background) {
            PuppyList(puppies)
        }
    }

    @Composable
    fun PuppyList(puppies: List<PuppyModel>) {
        LazyColumn(modifier = Modifier) {
            items(items = puppies) { puppy ->
                Puppy(name = puppy.name, handleClick = {
                    findNavController().navigate(R.id.puppyDetailFragment, Bundle().apply {
                        putString("puppyId", puppy.id)
                    })
                })
            }
        }
    }

    @Composable
    fun Puppy(name: String, handleClick: () -> Unit) {
        Text(text = name,
            modifier = Modifier.clickable(onClick = { handleClick() }))
        Divider(color = Color.Black)
    }

    @Preview("Light Theme", widthDp = 360, heightDp = 640)
    @Composable
    fun LightPreview() {
        MyTheme {
            PuppyListScreen(createPuppies())
        }
    }

    @Preview("Dark Theme", widthDp = 360, heightDp = 640)
    @Composable
    fun DarkPreview() {
        MyTheme(darkTheme = true) {
            PuppyListScreen(createPuppies())
        }
    }

    private fun createPuppies(): List<PuppyModel> {
        val puppies = mutableListOf<PuppyModel>()

        puppies.add(PuppyModel("1", "Sunny"))
        puppies.add(PuppyModel("2", "Cici"))
        puppies.add(PuppyModel("3", "Francesca"))
        puppies.add(PuppyModel("4", "Isabel"))
        puppies.add(PuppyModel("5", "Daisy"))

        return puppies
    }
}