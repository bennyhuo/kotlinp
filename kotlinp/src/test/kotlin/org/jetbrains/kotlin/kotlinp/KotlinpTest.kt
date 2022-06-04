package org.jetbrains.kotlin.kotlinp

import kotlinx.metadata.jvm.KotlinModuleMetadata
import org.junit.Test
import java.io.File

/**
 * Created by benny.
 */
class KotlinpTest {
    @Test
    fun test() {
        val settings = KotlinpSettings(true)
        KotlinModuleMetadata.read(File("testData/main/META-INF/kotlinp.kotlin_module").readBytes())
            ?.let {
                println(ModuleFilePrinter(settings).print(it))
            }
    }
}