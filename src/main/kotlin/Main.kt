fun main() {
    middleNode(prepareList(intArrayOf(1, 2, 3, 4, 5, 6)))
}

fun prepareList(array: IntArray): ListNode? {

    val head = ListNode(array[0])
    head.next = null
    for (i in 1 until array.size) {
        var temp = head
        while (temp.next != null) {
            temp = temp.next!!
        }
        temp.next = ListNode(array[i])
    }
    return head
}

fun middleNode(head: ListNode?): ListNode? {
    var temp = head
    val tempList = ArrayList<Int>()
    while (temp != null) {
        tempList.add(temp.`val`)
        temp = temp.next
    }
    return prepareList(tempList.subList(tempList.size / 2, tempList.size).toIntArray())
}

class ListNode(var `val`: Int) {
    var next: ListNode? = null
}