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
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.platform.ComposeView
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.fragment.app.Fragment

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
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val imageName = selectedPuppy.pic
        val packageName = requireContext().packageName
        val resourceId =
            requireContext().resources.getIdentifier(
                imageName,
                "drawable",
                packageName
            )
        val resourceIdToUse = if (resourceId == 0) { R.drawable.ic_baseline_broken_image } else resourceId

        // Inflate the layout for this fragment
        return ComposeView(layoutInflater.context).apply {
            id = R.id.puppyDetailFragment

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
                                    text = selectedPuppy.name,
                                    style = MaterialTheme.typography.subtitle1
                                )
                            }
                        )
                    },
                    content = {
                        Column(modifier = Modifier.padding(16.dp)) {
                            Image(
                                painter = painterResource(id = resourceIdToUse),
                                contentDescription = selectedPuppy.name,
                                modifier = Modifier.size(320.dp, 240.dp)
                                    .clip(MaterialTheme.shapes.medium)
                            )
                            Spacer(modifier = Modifier.height(16.dp))
                            Text(text = selectedPuppy.description)
                            Spacer(modifier = Modifier.height(16.dp))
                            Button(onClick = { }, modifier = Modifier.fillMaxWidth()) {
                                Text(text = "Adopt!")
                            }
                        }
                    }
                )
            }
        }
    }
}
