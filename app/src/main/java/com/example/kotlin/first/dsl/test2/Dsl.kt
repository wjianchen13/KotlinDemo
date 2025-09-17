package com.example.kotlin.first.dsl.test2

class Td {
    var content = ""
    fun html() = "\n\t\t<td>$content</td>"
}

class Tr {
    private val children = ArrayList<Td>()
    fun td(block: Td.() -> String) {
        val td = Td()
        td.content = td.block()
        children.add(td)
    }
    fun html(): String {
        val builder = StringBuilder()
        builder.append("\n\t<tr>")
        for (childTag in children) {
            builder.append(childTag.html())
        }
        builder.append("\n\t</tr>")
        return builder.toString()
    }
}

class Table {
    private val children = ArrayList<Tr>()

    fun tr(block: Tr.() -> Unit) {
        val tr = Tr()
        tr.block()
        children.add(tr)
    }

    fun html(): String {
        val builder = StringBuilder()
        builder.append("<table>")
        for (childTag in children) {
            builder.append(childTag.html())
        }
        builder.append("\n</table>")
        return builder.toString()
    }
}

fun table(block: Table.() -> Unit): String {
    val table = Table()
    table.block()
    return table.html()
}