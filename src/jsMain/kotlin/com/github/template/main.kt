package com.github.template

import kotlinx.browser.document
import kotlinx.dom.appendElement

fun main() {
    val root = document.getElementById("root") ?: error("Couldn't find root element")
    root.appendElement("p") {
        textContent = "Hello World!"
    }
}