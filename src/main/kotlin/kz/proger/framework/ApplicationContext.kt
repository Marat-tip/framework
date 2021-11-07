package kz.proger.framework

class ApplicationContext(
    private val definitionProvider: DefinitionProvider
) {
    private val components: MutableMap<String, Any> = HashMap()
    private val factory = PrimaryConstructorComponentFactory()

    init {
        definitionProvider.provide().forEach {
            components[it.name] = factory.create(it)
        }
    }
}
