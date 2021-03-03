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

class PuppyDatabase {

    companion object {
        @JvmStatic
        val puppiesList = createPuppies()

        private fun createPuppies(): List<PuppyModel> {
            val puppies = mutableListOf<PuppyModel>()

            puppies.add(PuppyModel("1", "Sunny", "sunny", description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aliquam sed turpis mi. Maecenas sit amet accumsan lacus. Fusce condimentum leo arcu. Vivamus placerat purus a enim scelerisque mattis. In fermentum augue purus. Phasellus non facilisis tortor. Sed sodales erat vel accumsan pharetra. Ut condimentum arcu id auctor eleifend."))
            puppies.add(PuppyModel("2", "Cici", "cici", description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aliquam sed turpis mi. Maecenas sit amet accumsan lacus. Fusce condimentum leo arcu. Vivamus placerat purus a enim scelerisque mattis. In fermentum augue purus. Phasellus non facilisis tortor. Sed sodales erat vel accumsan pharetra. Ut condimentum arcu id auctor eleifend."))
            puppies.add(PuppyModel("3", "Francesca", "francesca", description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aliquam sed turpis mi. Maecenas sit amet accumsan lacus. Fusce condimentum leo arcu. Vivamus placerat purus a enim scelerisque mattis. In fermentum augue purus. Phasellus non facilisis tortor. Sed sodales erat vel accumsan pharetra. Ut condimentum arcu id auctor eleifend."))
            puppies.add(PuppyModel("4", "Isabel", "isabel", description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aliquam sed turpis mi. Maecenas sit amet accumsan lacus. Fusce condimentum leo arcu. Vivamus placerat purus a enim scelerisque mattis. In fermentum augue purus. Phasellus non facilisis tortor. Sed sodales erat vel accumsan pharetra. Ut condimentum arcu id auctor eleifend."))
            puppies.add(PuppyModel("5", "Daisy", "daisy", description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aliquam sed turpis mi. Maecenas sit amet accumsan lacus. Fusce condimentum leo arcu. Vivamus placerat purus a enim scelerisque mattis. In fermentum augue purus. Phasellus non facilisis tortor. Sed sodales erat vel accumsan pharetra. Ut condimentum arcu id auctor eleifend."))
            puppies.add(PuppyModel("6", "Bruno", "bruno", description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aliquam sed turpis mi. Maecenas sit amet accumsan lacus. Fusce condimentum leo arcu. Vivamus placerat purus a enim scelerisque mattis. In fermentum augue purus. Phasellus non facilisis tortor. Sed sodales erat vel accumsan pharetra. Ut condimentum arcu id auctor eleifend."))
            puppies.add(PuppyModel("7", "Pluto", "pluto", description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aliquam sed turpis mi. Maecenas sit amet accumsan lacus. Fusce condimentum leo arcu. Vivamus placerat purus a enim scelerisque mattis. In fermentum augue purus. Phasellus non facilisis tortor. Sed sodales erat vel accumsan pharetra. Ut condimentum arcu id auctor eleifend."))
            puppies.add(PuppyModel("8", "Brutus", "brutus", description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aliquam sed turpis mi. Maecenas sit amet accumsan lacus. Fusce condimentum leo arcu. Vivamus placerat purus a enim scelerisque mattis. In fermentum augue purus. Phasellus non facilisis tortor. Sed sodales erat vel accumsan pharetra. Ut condimentum arcu id auctor eleifend."))
            puppies.add(PuppyModel("9", "Diego", "diego", description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aliquam sed turpis mi. Maecenas sit amet accumsan lacus. Fusce condimentum leo arcu. Vivamus placerat purus a enim scelerisque mattis. In fermentum augue purus. Phasellus non facilisis tortor. Sed sodales erat vel accumsan pharetra. Ut condimentum arcu id auctor eleifend."))
            puppies.add(PuppyModel("10", "Rover", "rover", description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aliquam sed turpis mi. Maecenas sit amet accumsan lacus. Fusce condimentum leo arcu. Vivamus placerat purus a enim scelerisque mattis. In fermentum augue purus. Phasellus non facilisis tortor. Sed sodales erat vel accumsan pharetra. Ut condimentum arcu id auctor eleifend."))
            puppies.add(PuppyModel("11", "Big D", "bigd", description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aliquam sed turpis mi. Maecenas sit amet accumsan lacus. Fusce condimentum leo arcu. Vivamus placerat purus a enim scelerisque mattis. In fermentum augue purus. Phasellus non facilisis tortor. Sed sodales erat vel accumsan pharetra. Ut condimentum arcu id auctor eleifend."))
            puppies.add(PuppyModel("12", "Smalls", "smalls", description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aliquam sed turpis mi. Maecenas sit amet accumsan lacus. Fusce condimentum leo arcu. Vivamus placerat purus a enim scelerisque mattis. In fermentum augue purus. Phasellus non facilisis tortor. Sed sodales erat vel accumsan pharetra. Ut condimentum arcu id auctor eleifend."))
            puppies.add(PuppyModel("13", "Zeus", "zeus", description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aliquam sed turpis mi. Maecenas sit amet accumsan lacus. Fusce condimentum leo arcu. Vivamus placerat purus a enim scelerisque mattis. In fermentum augue purus. Phasellus non facilisis tortor. Sed sodales erat vel accumsan pharetra. Ut condimentum arcu id auctor eleifend."))
            puppies.add(PuppyModel("14", "Titan", "titan", description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aliquam sed turpis mi. Maecenas sit amet accumsan lacus. Fusce condimentum leo arcu. Vivamus placerat purus a enim scelerisque mattis. In fermentum augue purus. Phasellus non facilisis tortor. Sed sodales erat vel accumsan pharetra. Ut condimentum arcu id auctor eleifend."))
            puppies.add(PuppyModel("15", "Jake", description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aliquam sed turpis mi. Maecenas sit amet accumsan lacus. Fusce condimentum leo arcu. Vivamus placerat purus a enim scelerisque mattis. In fermentum augue purus. Phasellus non facilisis tortor. Sed sodales erat vel accumsan pharetra. Ut condimentum arcu id auctor eleifend."))
            puppies.add(PuppyModel("16", "Slinky", description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aliquam sed turpis mi. Maecenas sit amet accumsan lacus. Fusce condimentum leo arcu. Vivamus placerat purus a enim scelerisque mattis. In fermentum augue purus. Phasellus non facilisis tortor. Sed sodales erat vel accumsan pharetra. Ut condimentum arcu id auctor eleifend."))
            puppies.add(PuppyModel("17", "Hopper", description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aliquam sed turpis mi. Maecenas sit amet accumsan lacus. Fusce condimentum leo arcu. Vivamus placerat purus a enim scelerisque mattis. In fermentum augue purus. Phasellus non facilisis tortor. Sed sodales erat vel accumsan pharetra. Ut condimentum arcu id auctor eleifend."))
            puppies.add(PuppyModel("18", "Digger", description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aliquam sed turpis mi. Maecenas sit amet accumsan lacus. Fusce condimentum leo arcu. Vivamus placerat purus a enim scelerisque mattis. In fermentum augue purus. Phasellus non facilisis tortor. Sed sodales erat vel accumsan pharetra. Ut condimentum arcu id auctor eleifend."))
            puppies.add(PuppyModel("19", "Shaker", description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aliquam sed turpis mi. Maecenas sit amet accumsan lacus. Fusce condimentum leo arcu. Vivamus placerat purus a enim scelerisque mattis. In fermentum augue purus. Phasellus non facilisis tortor. Sed sodales erat vel accumsan pharetra. Ut condimentum arcu id auctor eleifend."))
            puppies.add(PuppyModel("20", "William", description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aliquam sed turpis mi. Maecenas sit amet accumsan lacus. Fusce condimentum leo arcu. Vivamus placerat purus a enim scelerisque mattis. In fermentum augue purus. Phasellus non facilisis tortor. Sed sodales erat vel accumsan pharetra. Ut condimentum arcu id auctor eleifend."))

            return puppies
        }
    }
}
