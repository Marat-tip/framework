package kz.proger.framework

import kotlin.reflect.KClass

interface ComponentDefinition<T : Any> {
    val name: String
    val type: KClass<T>
}
