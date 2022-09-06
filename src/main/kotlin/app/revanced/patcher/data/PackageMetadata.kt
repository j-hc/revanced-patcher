package app.revanced.patcher.data

import brut.androlib.meta.MetaInfo

/**
 * Metadata about a package.
 */
class PackageMetadata {
    lateinit var packageName: String
    var packageVersion: String? = null

    internal val metaInfo: MetaInfo = MetaInfo()
}
