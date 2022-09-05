package app.revanced.patcher

import app.revanced.patcher.data.Data
import app.revanced.patcher.data.PackageMetadata
import app.revanced.patcher.data.impl.BytecodeData
import app.revanced.patcher.data.impl.ResourceData
import app.revanced.patcher.patch.Patch
import org.jf.dexlib2.Opcodes
import org.jf.dexlib2.iface.ClassDef
import java.io.File

data class PatcherData(
    internal val opcodes: Opcodes?,
    internal val internalClasses: MutableList<ClassDef>?,
    val isResFile: Boolean,
    internal val resourceCacheDirectory: String,
    val packageMetadata: PackageMetadata,
    val file: File
) {
    internal val patches = mutableListOf<Class<out Patch<Data>>>()
    internal val bytecodeData = if (!isResFile) BytecodeData(internalClasses!!) else null
    internal val resourceData = ResourceData(File(resourceCacheDirectory))
}