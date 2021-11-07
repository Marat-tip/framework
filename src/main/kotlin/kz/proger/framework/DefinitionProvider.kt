package kz.proger.framework

interface DefinitionProvider {
    fun provide(): Set<ComponentDefinition<*>>
}
