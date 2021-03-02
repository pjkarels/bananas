package com.example.androiddevchallenge

class PuppyDatabase {

    companion object {
        @JvmStatic
        val puppiesList = createPuppies()

        private fun createPuppies(): List<PuppyModel> {
            val puppies = mutableListOf<PuppyModel>()

            puppies.add(PuppyModel("1", "Sunny", description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aliquam sed turpis mi. Maecenas sit amet accumsan lacus. Fusce condimentum leo arcu. Vivamus placerat purus a enim scelerisque mattis. In fermentum augue purus. Phasellus non facilisis tortor. Sed sodales erat vel accumsan pharetra. Ut condimentum arcu id auctor eleifend."))
            puppies.add(PuppyModel("2", "Cici", description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aliquam sed turpis mi. Maecenas sit amet accumsan lacus. Fusce condimentum leo arcu. Vivamus placerat purus a enim scelerisque mattis. In fermentum augue purus. Phasellus non facilisis tortor. Sed sodales erat vel accumsan pharetra. Ut condimentum arcu id auctor eleifend."))
            puppies.add(PuppyModel("3", "Francesca", description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aliquam sed turpis mi. Maecenas sit amet accumsan lacus. Fusce condimentum leo arcu. Vivamus placerat purus a enim scelerisque mattis. In fermentum augue purus. Phasellus non facilisis tortor. Sed sodales erat vel accumsan pharetra. Ut condimentum arcu id auctor eleifend."))
            puppies.add(PuppyModel("4", "Isabel", description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aliquam sed turpis mi. Maecenas sit amet accumsan lacus. Fusce condimentum leo arcu. Vivamus placerat purus a enim scelerisque mattis. In fermentum augue purus. Phasellus non facilisis tortor. Sed sodales erat vel accumsan pharetra. Ut condimentum arcu id auctor eleifend."))
            puppies.add(PuppyModel("5", "Daisy", description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aliquam sed turpis mi. Maecenas sit amet accumsan lacus. Fusce condimentum leo arcu. Vivamus placerat purus a enim scelerisque mattis. In fermentum augue purus. Phasellus non facilisis tortor. Sed sodales erat vel accumsan pharetra. Ut condimentum arcu id auctor eleifend."))
            puppies.add(PuppyModel("6", "Bruno", description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aliquam sed turpis mi. Maecenas sit amet accumsan lacus. Fusce condimentum leo arcu. Vivamus placerat purus a enim scelerisque mattis. In fermentum augue purus. Phasellus non facilisis tortor. Sed sodales erat vel accumsan pharetra. Ut condimentum arcu id auctor eleifend."))
            puppies.add(PuppyModel("7", "Pluto", description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aliquam sed turpis mi. Maecenas sit amet accumsan lacus. Fusce condimentum leo arcu. Vivamus placerat purus a enim scelerisque mattis. In fermentum augue purus. Phasellus non facilisis tortor. Sed sodales erat vel accumsan pharetra. Ut condimentum arcu id auctor eleifend."))
            puppies.add(PuppyModel("8", "Brutus", description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aliquam sed turpis mi. Maecenas sit amet accumsan lacus. Fusce condimentum leo arcu. Vivamus placerat purus a enim scelerisque mattis. In fermentum augue purus. Phasellus non facilisis tortor. Sed sodales erat vel accumsan pharetra. Ut condimentum arcu id auctor eleifend."))
            puppies.add(PuppyModel("9", "Diego", description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aliquam sed turpis mi. Maecenas sit amet accumsan lacus. Fusce condimentum leo arcu. Vivamus placerat purus a enim scelerisque mattis. In fermentum augue purus. Phasellus non facilisis tortor. Sed sodales erat vel accumsan pharetra. Ut condimentum arcu id auctor eleifend."))
            puppies.add(PuppyModel("10", "Rover", description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aliquam sed turpis mi. Maecenas sit amet accumsan lacus. Fusce condimentum leo arcu. Vivamus placerat purus a enim scelerisque mattis. In fermentum augue purus. Phasellus non facilisis tortor. Sed sodales erat vel accumsan pharetra. Ut condimentum arcu id auctor eleifend."))
            puppies.add(PuppyModel("11", "Big D", description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aliquam sed turpis mi. Maecenas sit amet accumsan lacus. Fusce condimentum leo arcu. Vivamus placerat purus a enim scelerisque mattis. In fermentum augue purus. Phasellus non facilisis tortor. Sed sodales erat vel accumsan pharetra. Ut condimentum arcu id auctor eleifend."))
            puppies.add(PuppyModel("12", "Smalls", description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aliquam sed turpis mi. Maecenas sit amet accumsan lacus. Fusce condimentum leo arcu. Vivamus placerat purus a enim scelerisque mattis. In fermentum augue purus. Phasellus non facilisis tortor. Sed sodales erat vel accumsan pharetra. Ut condimentum arcu id auctor eleifend."))
            puppies.add(PuppyModel("13", "Zeus", description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aliquam sed turpis mi. Maecenas sit amet accumsan lacus. Fusce condimentum leo arcu. Vivamus placerat purus a enim scelerisque mattis. In fermentum augue purus. Phasellus non facilisis tortor. Sed sodales erat vel accumsan pharetra. Ut condimentum arcu id auctor eleifend."))
            puppies.add(PuppyModel("14", "Titan", description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aliquam sed turpis mi. Maecenas sit amet accumsan lacus. Fusce condimentum leo arcu. Vivamus placerat purus a enim scelerisque mattis. In fermentum augue purus. Phasellus non facilisis tortor. Sed sodales erat vel accumsan pharetra. Ut condimentum arcu id auctor eleifend."))
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