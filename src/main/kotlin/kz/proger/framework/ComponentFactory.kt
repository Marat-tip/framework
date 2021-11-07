package kz.proger.framework

interface ComponentFactory {
    fun <T: Any> create(definition: ComponentDefinition<T>): T
}

class PrimaryConstructorComponentFactory: ComponentFactory {
    override fun <T: Any> create(definition: ComponentDefinition<T>): T {
        return definition.type.constructors.first().call()
    }
}
