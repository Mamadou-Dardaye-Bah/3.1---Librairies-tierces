package org.Bah

import org.jsoup.Jsoup
import org.jsoup.nodes.Document
import org.jsoup.nodes.Element
import org.jsoup.select.Elements


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val doc: Document = Jsoup.connect("https://en.wikipedia.org/").get()
    println(doc.title())
    val balise_a: Elements = doc.select("a")
    for (headline in balise_a) {
        println("${headline.text()} = ${headline.attr("href")}")
        println(2)
    }
}