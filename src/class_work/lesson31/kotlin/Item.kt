package class_work.lesson31.kotlin

class Item{
    val num:Int
    var name:String?
    set(value) {
        field=value
        changeCount++
    }

    constructor(num:Int,name:String?){
        this.num = num
        this.name = name
    }

    companion object {
        var changeCount:Int=0

        fun getText() = "fdsfdsfds $changeCount"
    }
}