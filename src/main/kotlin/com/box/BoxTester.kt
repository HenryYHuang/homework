package com.trainKt

fun main(args: Array<String>) {
    print("Please enter object's length:")
    val lenght = readLine()!!.toFloat()
    print("Please enter object's width:")
    val width = readLine()!!.toFloat()
    print("Please enter object's height:")
    val height = readLine()!!.toInt()
    val b = Box.selectBox(lenght, width, height)
    print(b)
}

abstract class Box(val length:Float, val width:Float, val height:Int) {
    companion object {
        val boxs = mutableListOf(Box3(), Box5())
        fun selectBox(length:Float, width:Float, height:Int ): String{
            for (box in boxs) {
                if (box.validate(length, width, height)) {
                    return "${box.name()}, 長：${box.length}, 寬：${box.width}, 高：${box.height}"
                }
            }
            return "暫時沒有符合的箱子"
        }
    }
    fun validate(length:Float, width:Float, height:Int): Boolean {
        return this.length >= length && this.width >= width && this.height >= height
    }
    abstract fun name() : String
}

class Box3: Box(23f, 14f,13) {
    override fun name(): String {
        return "Box3"
    }
}

class Box5 : Box(39.5f, 27.5f, 23) {
    override fun name(): String {
        return "Box5"
    }

}

