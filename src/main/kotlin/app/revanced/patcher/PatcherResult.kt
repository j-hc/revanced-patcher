package app.revanced.patcher

import app.revanced.patcher.data.PackageMetadata
import app.revanced.patcher.util.dex.DexFile
import java.io.File

/**
 * The result of a patcher.
 * @param dexFiles The patched dex files.
 * @param doNotCompress List of relative paths to files to exclude from compressing.
 * @param resourceFile File containing resources that need to be extracted into the APK.
 */
data class PatcherResult(
    val dexFiles: List<DexFile>,
    val doNotCompress: List<String>? = null,
    val resourceFile: File?,
    val packageMetadata: PackageMetadata,
    val file: File
)