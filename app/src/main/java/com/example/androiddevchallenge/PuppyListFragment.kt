/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.androiddevchallenge

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Divider
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.ComposeView
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.androiddevchallenge.ui.theme.MyTheme

/**
 * A simple [Fragment] subclass.
 * create an instance of this fragment.
 */
class PuppyListFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
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
                Scaffold(
                    topBar = {
                        TopAppBar(
                            title = {
                                Text(
                                    text = "Puppy Adoption!",
                                    style = MaterialTheme.typography.subtitle2
                                )
                            }
                        )
                    },
                    content = {
                        PuppyListScreen(
                            puppies = PuppyDatabase.puppiesList,
                            handleClick = { id ->
                                viewDetail(id)
                            }
                        )
                    }
                )
            }
        }
    }

    @Composable
    fun PuppyListScreen(puppies: List<PuppyModel>, handleClick: (String) -> Unit) {
        Surface(color = MaterialTheme.colors.background) {
            PuppyList(puppies, handleClick)
        }
    }

    @Composable
    fun PuppyList(puppies: List<PuppyModel>, handleClick: (String) -> Unit) {
        LazyColumn(modifier = Modifier.padding(horizontal = 16.dp)) {
            items(items = puppies) { puppy ->
                Puppy(
                    name = puppy.name,
                    handleClick = {
                        handleClick(puppy.id)
                    }
                )
            }
        }
    }

    @Composable
    fun Puppy(name: String, handleClick: () -> Unit) {
        Row(
            modifier = Modifier.clickable(onClick = { handleClick() }).padding(16.dp)
                // makes entire row width clickable
                .fillMaxWidth()
        ) {
            Text(text = name)
        }
        Divider(color = Color.LightGray)
    }

    @Preview("Light Theme", widthDp = 360, heightDp = 640)
    @Composable
    fun LightPreview() {
        MyTheme {
            PuppyListScreen(
                PuppyDatabase.puppiesList,
                handleClick = { id ->
                    viewDetail(id)
                }
            )
        }
    }

    @Preview("Dark Theme", widthDp = 360, heightDp = 640)
    @Composable
    fun DarkPreview() {
        MyTheme(darkTheme = true) {
            PuppyListScreen(
                PuppyDatabase.puppiesList,
                handleClick = { id ->
                    viewDetail(id)
                }
            )
        }
    }

    private fun viewDetail(puppyId: String) {
        // fixme: seems to be a bug where [FragmentName]Directions class is not getting generated
        findNavController().navigate(
            R.id.puppyDetailFragment,
            Bundle().apply {
                putString("puppyId", puppyId)
            }
        )
    }
}
