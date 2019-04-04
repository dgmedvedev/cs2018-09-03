package class_work.lesson31

import class_work.lesson31.kotlin.Item
import java.util.LinkedList

class TestMyClass_kt { //ctr+shift+alt+k

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val list = (0..10).map { i -> Item(i, if (i % 3 == 0) null else "fdgf") }

            val list2 = list.filter { it.num % 2 == 0 }


            list.maxBy { it.name?.length ?: 0 }
            list.all { it.num in 0..20 }
        }

    }
}
