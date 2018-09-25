package by.it.students.andruhin.lesson06;

class Dog
    {
        Dog()
        {}


        private String name;
        public String getName()
        {
            return name;
        }
        public void setName(String name)
        {
            this.name = name;
        }


        private int age;
        public int getAge()
        {
            return age;
        }
        public void setAge(int age)
        {
            this.age = age;
        }

        private int weight;
        public int getWeight() {
            return weight;
        }

        public void setWeight(int weight) {
            this.weight = weight;
        }

        private double power;
        public double getPower() {
            return power;
        }

        public void setPower(double power) {
            this.power = power;
        }


        public String toString()
        {
            return "Кличка: " + name + ". Возраст: " + age;
        }

        boolean win(Dog otherDog)
        {
            return true;
        }

    }
