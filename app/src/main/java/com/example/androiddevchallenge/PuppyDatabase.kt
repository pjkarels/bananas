package com.example.androiddevchallenge

class PuppyDatabase {

    companion object {
        @JvmStatic
        val puppiesList = createPuppies()

        private fun createPuppies(): List<PuppyModel> {
            val puppies = mutableListOf<PuppyModel>()

            puppies.add(PuppyModel("1", "Sunny"))
            puppies.add(PuppyModel("2", "Cici"))
            puppies.add(PuppyModel("3", "Francesca"))
            puppies.add(PuppyModel("4", "Isabel"))
            puppies.add(PuppyModel("5", "Daisy"))
            puppies.add(PuppyModel("6", "Bruno"))
            puppies.add(PuppyModel("7", "Pluto"))
            puppies.add(PuppyModel("8", "Brutus"))
            puppies.add(PuppyModel("9", "Diego"))
            puppies.add(PuppyModel("10", "Rover"))
            puppies.add(PuppyModel("11", "Big D"))
            puppies.add(PuppyModel("12", "Smalls"))
            puppies.add(PuppyModel("13", "Zeus"))
            puppies.add(PuppyModel("14", "Titan"))
            puppies.add(PuppyModel("15", "Jake"))
            puppies.add(PuppyModel("16", "Slinky"))
            puppies.add(PuppyModel("17", "Hopper"))
            puppies.add(PuppyModel("18", "Digger"))
            puppies.add(PuppyModel("19", "Shaker"))
            puppies.add(PuppyModel("20", "William"))

            return puppies
        }
    }
}