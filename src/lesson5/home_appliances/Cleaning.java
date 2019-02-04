package lesson5.home_appliances;

abstract class Cleaning extends HomeAppliances {
    Cleaning(double width, double length, double height, String color, String title, String function) {
        super(width, length, height, color, title, function);
    }
}